package Concurrency.Executors;

public class PrintNumber implements Runnable{

    private int num;

    public PrintNumber(int num){
        this.num = num;
    }
    @Override
    public void run() {
        System.out.println("Number "+ num +" " +Thread.currentThread().getName());
    }
}
