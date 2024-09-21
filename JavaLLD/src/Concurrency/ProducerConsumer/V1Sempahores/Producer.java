package Concurrency.ProducerConsumer.V1Sempahores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    Store store;
    Semaphore producerSemaphore, consumerSemaphore;


    public Producer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
    }


    @Override
    public void run() {
        while(true){

                try {
                    producerSemaphore.acquire();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                store.addItem();
                    consumerSemaphore.release();
            }


    }
}
