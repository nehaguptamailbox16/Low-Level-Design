package Concurrency.MultithreadMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {

    List<Integer> list;
    ExecutorService es;

   public MergeSort(List<Integer> list, ExecutorService es){
        this.list = list;
        this.es = es;
    }
    @Override
    public List<Integer> call() throws Exception {

       if(list.size()==1){
           return list;
       }

       List<Integer> left = new ArrayList<>();
       List<Integer> right = new ArrayList<>();

       for(int i=0; i<list.size()/2; i++){
           left.add(list.get(i));
       }

       for(int i=list.size()/2; i<list.size(); i++){
           right.add(list.get(i));
       }


       Future<List<Integer>> leftSorted = es.submit(new MergeSort(left, es));
       Future<List<Integer>> rightSorted = es.submit(new MergeSort(right, es));

       return merge(leftSorted.get(), rightSorted.get());



    }


    List<Integer> merge(List<Integer> left, List<Integer> right){

       List<Integer> result = new ArrayList<>();

       int i = 0;
       int j = 0;

       while(i<left.size() && j<right.size()){
           if(left.get(i)<right.get(j)){
               result.add(left.get(i));
               i++;
           }else{
               result.add(right.get(j));
               j++;
           }
       }

       while(i<left.size()){
           result.add(left.get(i));
           i++;
       }

       while(j<right.size()){
           result.add(right.get(j));
           j++;
       }


       return result;
    }

}
