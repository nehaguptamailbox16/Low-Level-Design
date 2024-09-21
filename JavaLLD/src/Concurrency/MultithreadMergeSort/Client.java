package Concurrency.MultithreadMergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> list  = List.of(8,1,3,9,7,2,6);


        ExecutorService es = Executors.newCachedThreadPool();
        MergeSort ms = new MergeSort(list, es);


        Future<List<Integer>> fs = es.submit(ms);

        System.out.println("data " + fs.get());
    }
}
