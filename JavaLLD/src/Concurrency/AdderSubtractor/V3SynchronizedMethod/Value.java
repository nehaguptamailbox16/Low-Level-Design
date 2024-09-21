package Concurrency.AdderSubtractor.V3SynchronizedMethod;

public class Value {

    int num = 0;


    synchronized void increment(int i){
        num +=i;
    }

    synchronized void decrement(int i){
        num -=i;
    }
}
