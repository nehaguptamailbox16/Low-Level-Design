package JavaBasic.Inheritance.MultilevelInheritance;

public class C extends B{

    C(){
        super(); // call to super should be in first line
        System.out.println("C default constructor");
    }

    C(int num){
        //super(); // Super and this has to be first statement

        this();
        System.out.println("C parametrized constructor");
    }
}
