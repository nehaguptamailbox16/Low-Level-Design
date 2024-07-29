package DesignPattern.BuilderDesignPattern.Version3;

public class Client {
    public static void main(String[] args) {


        //Now to prevent the creation of Student object like below. we will make constructor of Student private
        //if we make constructor private below will error
            // Student s1 = new Student(new StudentBuilder());

        //Final Version. In this version SRP & OCP principle is voilated. So it our responsibilty to decide
        //which version to use. this version is also fine because StudentBuilder class is associated with Student class only

        Student s = Student.getBuilder()
                .setAge(21)
                .setBatch("March2023")
                .setGradYear(2024)
                .setName("Neha")
                .build();



    }
}
