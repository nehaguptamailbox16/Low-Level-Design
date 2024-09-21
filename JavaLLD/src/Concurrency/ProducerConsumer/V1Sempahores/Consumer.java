package Concurrency.ProducerConsumer.V1Sempahores;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    Store store;
    Semaphore producerSemaphore, consumerSemaphore;

    public Consumer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
    }


    @Override
    public void run() {

        while(true){

                try {
                    consumerSemaphore.acquire();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                store.removeItem();
                    producerSemaphore.release();


        }


    }
}
