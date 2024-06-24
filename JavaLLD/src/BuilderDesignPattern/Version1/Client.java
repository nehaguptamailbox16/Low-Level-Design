package BuilderDesignPattern.Version1;

public class Client {
    public static void main(String[] args) {

        // Here instead of separate calling of setter method, we are calling in much bette way to easy to understand
        // and readable.


        StudentBuilder builder =new StudentBuilder()
                .setAge(21)
                .setGradYear(2023)
                .setName("Neha")
                .setBatch("Mar2023");


        Student s = new Student(builder);


    }
}
