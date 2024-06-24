package BuilderDesignPattern.Version3;

public class Student {

    int age;
    String name;
    String batch;
    int gradYear;

    private Student(StudentBuilder builder){
        this.age =  builder.age;
        this.name =  builder.name;
        this.batch =  builder.batch;
        this.gradYear =  builder.gradYear;

    }

    // creating StudentBuilder class object, so that in client class there is no need to create it by user.
    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }








    // inner static class because non static class cant be called Static getBuilder method.

    public static class StudentBuilder {

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
            // move your validations here
            // So benefit is that before creation of object we can do validations. benefit of builder class.

            if(this.age < 20){
                throw new IllegalArgumentException("Age must be at least 20");
            }
            if(this.gradYear > 2024){
                throw new IllegalArgumentException("GradYear must be smaller than 2024");
            }
            if(this.name == null){
                throw new IllegalArgumentException("Name cannot be null");
            }

            return new Student(this);
        }

    }

}
