package JavaBasic.Constructor;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.attendingClass();

        Student s1 = new Student(10, "neha");
        s1.printStudent();


        //Copy constructor calling
        Student st2 = new Student(s1);
        st2.printStudent();

    }
}
