package Concurrency.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

  public static void main(String[] args) {


      //Executor service with fixed Thread pool size
      ExecutorService es = Executors.newFixedThreadPool(10);

      // Executor service with cache Thread pool (thread created accordingly)
      ExecutorService ess = Executors.newCachedThreadPool();

        for(int i = 1; i < 100000; i++) {
            if(i == 80){
                System.out.println(" ");
            }

            PrintNumber printNumber = new PrintNumber(i);
            es.execute(printNumber);
            ess.execute(printNumber);
        }
  }
}
