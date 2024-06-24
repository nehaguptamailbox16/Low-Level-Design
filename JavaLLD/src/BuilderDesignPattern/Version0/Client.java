package BuilderDesignPattern.Version0;

public class Client {
    public static void main(String[] args) {
        StudentBuilder builder = new StudentBuilder();
        builder.setAge(21);
        builder.setGradYear(2023);
        builder.setName("Neha");
        builder.setBatch("Mar2023");

        Student s = new Student(builder);
        System.out.println(s);

    }
}
