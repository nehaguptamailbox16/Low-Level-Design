package Concurrency.AdderSubtractor.V3Atomic;

import java.util.concurrent.Callable;

public class Substractor  implements Callable<Void> {
    private Value v;

    Substractor(Value x){
        v = x;
    }
    public Void call (){
        for(int i = 1;i <=5000; i++){
            this.v.num.addAndGet(-1);  // this will compare initial value and then swap.
        }
        return null;
    }
}
