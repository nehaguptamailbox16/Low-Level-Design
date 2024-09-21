package Concurrency.ProducerConsumer.V0;

public class Consumer implements Runnable {

    Store store;

    Consumer(Store store){
        this.store = store;
    }


    @Override
    public void run() {

        while(true){
            synchronized (store) {
                if (!store.getItems().isEmpty()) {
                    store.removeItem();
                }
            }
        }


    }
}
