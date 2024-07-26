package JavaBasic.Interfaces;

public class Dog implements Runner{
    @Override
    public void run() {
        System.out.println(Runner.num);
        System.out.println("Dog run");
    }

    @Override
    public void walk() {
        Runner.super.walk();
        System.out.println("Walking Dog");
    }
}
