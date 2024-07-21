package JavaBasic.AccessModifier;

public class Student {

    // when you do not write nay access modifier then it is DEFAULT
    int age;
    private String name;
    protected String batch;
    public double psp;

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
