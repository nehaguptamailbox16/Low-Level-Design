package JavaBasic.Inheritance;

public class Student  extends User{
    double psp;
    String batch;


    void attendClass(){
        this.name = "Neha";
        this.setId(20);  // private member of parent class can be accessed by getter & setter.
    }

}
