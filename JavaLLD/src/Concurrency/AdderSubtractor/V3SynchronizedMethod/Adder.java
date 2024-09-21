package Concurrency.AdderSubtractor.V3SynchronizedMethod;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {

    private Value v;

    Adder(Value x){
        v = x;

    }

    @Override
     public Void call (){

        for(int i = 1;i <=5000; i++){

            v.increment(i);

        }
        return null;
    }
}
