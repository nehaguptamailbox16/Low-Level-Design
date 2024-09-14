package Concurrency.IntroToThread;

public class HelloWorldExtends extends Thread {


    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("Hello World");
    }

}
