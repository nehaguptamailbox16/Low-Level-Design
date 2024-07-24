package JavaBasic.Inheritance.MultilevelInheritance;

public class B extends A{

    B(){
        super(10);// as default constructor of A is private that's why we have to call some other constructor.
        System.out.println("B default constructor");

    }
}
