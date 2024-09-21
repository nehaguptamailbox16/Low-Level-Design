package Concurrency.AdderSubtractor.V0;

import java.util.concurrent.Callable;

public class Substractor  implements Callable<Void> {
    private Value v;

    Substractor(Value x){
        v = x;
    }
    public Void call (){
        for(int i = 1;i <=5000; i++){
            this.v.num -= i;
        }
        return null;
    }
}
