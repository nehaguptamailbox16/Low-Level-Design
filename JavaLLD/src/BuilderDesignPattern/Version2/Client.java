package BuilderDesignPattern.Version2;

public class Client {
    public static void main(String[] args) {


        Student s = Student.getBuilder()
                .setAge(21)
                .setBatch("March2023")
                .setGradYear(2023)
                .setName("Neha")
                .build();



    }
}
