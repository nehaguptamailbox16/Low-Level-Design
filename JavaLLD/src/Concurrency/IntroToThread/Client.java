package Concurrency.IntroToThread;

public class Client {
    public static void main(String[] args) {

        //implementing runnable interface
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(helloWorld);
        thread.start();


        //extending Thread class.
        Thread threadExtends = new HelloWorldExtends();
        threadExtends.start();



        //Executing each number in separate thread
        for(int i = 1; i < 1000; i++) {
            PrintNumberEachThread printNumberEachThread = new PrintNumberEachThread(i);

            Thread th = new Thread(printNumberEachThread);
            th.start();

        }
    }
}
