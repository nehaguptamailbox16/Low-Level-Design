package JavaBasic.PassByValue;

class Students {
    int age;
    String name;

    void display(){
        System.out.println("My name is " + this.name + ". I am "  + this.age + " years old");
    }

    void sayHello(String name){
        System.out.println(this.name + " says hello to " + name);
    }
}

public class StudentExample {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.age = 10;
        s1.name = "A";

        Students s2 = new Students();
        s2.age = 20;
        s2.name = "B";

        swap(s1, s2);

        s1.display();
    }

    private static void swap(Students s1, Students s2) {
        int tage = s1.age;
        s1.age = s2.age;
        s2.age = tage;

        String tname = s1.name;
        s1.name = s2.name;
        s2.name = tname;
    }
}
