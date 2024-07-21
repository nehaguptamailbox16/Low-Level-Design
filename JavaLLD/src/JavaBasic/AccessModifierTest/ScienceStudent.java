package JavaBasic.AccessModifierTest;

import JavaBasic.AccessModifier.Student;

public class ScienceStudent extends Student {

    void printScienceStudent(){

        // As batch in Student class is Protected
        System.out.println("Science Student batch: " + super.batch);

        //As psp is public in Student class
        System.out.println("Science Student psp: " + super.psp);

        //As name & age is default & private so giving error
       // System.out.println(super.name + super.age);

    }
}
