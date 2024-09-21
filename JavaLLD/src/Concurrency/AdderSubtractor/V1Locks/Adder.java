package Concurrency.AdderSubtractor.V1Locks;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {

    private Value v;
    private Lock lock;


    Adder(Value x, Lock lock){
        v = x;
        this.lock = lock;

    }

    @Override
    public Void call (){
        // if we put lock over here then whole loop for adder will work then whole loop subtractor will work vice verse but at one go it will work

        for(int i = 1;i <=5000; i++){
            lock.lock(); // if we put lock here then sometime adder will work and sometime substractor will work
            this.v.num += i;
            lock.unlock();
        }
        return null;
    }
}
