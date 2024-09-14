package Concurrency.IntroToThread;

public class HelloWorld implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Hello World");
    }
}
