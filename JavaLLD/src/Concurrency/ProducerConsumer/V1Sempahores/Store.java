package Concurrency.ProducerConsumer.V1Sempahores;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {


    private int size = 0;
    private ConcurrentLinkedQueue<Object> list;  // normal list will not work because at a time it concurrent exception.

    Store(int size){
        this.size = size;
        list = new ConcurrentLinkedQueue<>();
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
        this.list.remove();
    }

    ConcurrentLinkedQueue<Object> getItems(){
        return list;
    }


}
