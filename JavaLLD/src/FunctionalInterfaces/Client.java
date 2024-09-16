package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        //Function Interface - Interface having only 1 method
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run thread 1");
            }
        };

        Thread t1 = new Thread(r1);
        t1.start();


        //lambda

        Thread t2 = new Thread(()-> System.out.println("run thread 2"));


        Student s1 = new Student("John", 22);
        Student s2 = new Student("Jane", 23);

        List<Student> list  = new ArrayList<>();
        list.add(s1);
        list.add(s2);

        Collections.sort(list, ( o,  e) -> {
            if(o.age > e.age)
                return -1;
            else if(o.age < e.age)
                return 1;
            else
                return 0;

        });

    }
}
