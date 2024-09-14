package Generics;

public class Pair <V,S>{
    V first;
    S second;


    public V getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public void setFirst(V first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    // Static Method

    public static <T> void doSomething(T first){
        System.out.println(first);
    }

    public static <T> T doSomethingReturn(T first){
       return first;
    }


    public <Z> Z doAgain(Z first){

        return first;
    }
}

