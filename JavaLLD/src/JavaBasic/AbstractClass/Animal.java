package JavaBasic.AbstractClass;

public abstract class Animal {

    int noOfLegs;
    private int id;


    void eat(){
        System.out.println("Eating...");
    }

    abstract void walk();
}
