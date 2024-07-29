package DesignPattern.BuilderDesignPattern.Version2;

public class StudentBuilder {

    int age;
    String name;
    String batch;
    int gradYear;

    public StudentBuilder setAge(int age) {

        this.age = age;

        // returning StudentBuilder object, so that we can chain multiple setter together;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public StudentBuilder setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }

    //This method will create the object of the Student class. "this" will send the object of the StudentBuilder.

    public Student build() {
        return new Student(this);
    }

}
