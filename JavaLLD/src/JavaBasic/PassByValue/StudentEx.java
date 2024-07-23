package JavaBasic.PassByValue;

class Student2 {
    int age;
    String name;

    void display(){
        System.out.println("My name is " + this.name + ". I am "  + this.age + " years old");
    }

    void sayHello(String name){
        System.out.println(this.name + " says hello to " + name);
    }
}

public class StudentEx {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.age = 10;
        s1.name = "A";

        Student2 s2 = new Student2();
        s2.age = 20;
        s2.name = "B";

        swap(s1, s2);

        s1.display();
    }

    private static void swap(Student2 s1, Student2 s2) {
        Student2 temp = s1;
        s1 = s2;
        s2 = temp;
    }
}
