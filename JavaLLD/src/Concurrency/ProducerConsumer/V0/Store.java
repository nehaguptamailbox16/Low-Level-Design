package Concurrency.ProducerConsumer.V0;

import java.util.ArrayList;
import java.util.List;

public class Store {


    private int size = 0;
    private List<Object> list;

    Store(int size){
        this.size = size;
        list = new ArrayList<>();
    }


    int getMaxSize(){
        return size;
    }

    void addItem(){
        System.out.println("Producer production time, current size " + this.list.size());
        list.add(new Object());
    }

    void removeItem(){
        System.out.println("Consumer consuming time, current size " + this.list.size());
        this.list.remove(this.list.size() - 1);
    }

    List<Object> getItems(){
        return list;
    }


}
