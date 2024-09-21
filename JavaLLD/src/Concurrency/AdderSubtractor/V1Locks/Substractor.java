package Concurrency.AdderSubtractor.V1Locks;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Substractor  implements Callable<Void> {
    private Value v;
    private Lock lock;
    Substractor(Value x, Lock lock){

        v = x;
        this.lock = lock;
    }
    public Void call (){
        for(int i = 1;i <=5000; i++){
            lock.lock();
            this.v.num -= i;
            lock.unlock();
        }
        return null;
    }
}
