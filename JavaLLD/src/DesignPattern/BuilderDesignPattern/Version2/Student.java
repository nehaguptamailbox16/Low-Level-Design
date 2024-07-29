package DesignPattern.BuilderDesignPattern.Version2;

public class Student {

    int age;
    String name;
    String batch;
    int gradYear;

    Student(StudentBuilder builder){

                // validations in constructor of Student class
            // So benefit is that before creation of object we can do validations. benefit of builder class.
        if(builder.age < 20){
            throw new IllegalArgumentException("Age must be at least 20");
        }
        if(builder.gradYear > 2024){
            throw new IllegalArgumentException("GradYear must be smaller than 2024");
        }
        if(builder.name == null){
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.age =  builder.age;
        this.name =  builder.name;
        this.batch =  builder.batch;
        this.gradYear =  builder.gradYear;

    }

    // creating StudentBuilder class object, so that in client class there is no need to create it by user.
    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }
}
