package JavaBasic.Constructor;

public class Student {

    int age;
    private String name;
    protected String batch;
    public double psp;

    Exam exam;


    public Student(){
        this.age = 10;
        this.name = "John";
        this.batch = "new batch";
        this.psp = 3.14;
    }

    public Student(int age, String name){
        this.age = age;
        this.name = name;
        this.exam = new Exam(10,100);
    }

    //Copy Constructor
    public Student(Student other){
        this.age = other.age;
        this.name = other.name;
        this.batch = other.batch;
        this.psp = other.psp;

        //just coping the reference variable. not coping the values.
        //this.exam = other.exam;

        this.exam = new Exam(other.exam);
    }



    void printStudent(){
        System.out.println("Name: " + name + " Age: " + age);
    }

    void attendingClass(){
        System.out.println("Attending the class");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
