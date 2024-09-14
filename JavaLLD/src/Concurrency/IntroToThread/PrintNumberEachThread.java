package Concurrency.IntroToThread;

public class PrintNumberEachThread implements Runnable{

    private int num;

    PrintNumberEachThread( int num){
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Number " + num + " "+ Thread.currentThread().getName());
    }
}
