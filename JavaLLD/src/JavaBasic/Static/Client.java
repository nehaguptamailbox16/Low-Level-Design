package JavaBasic.Static;

public class Client {
    public static void main(String[] args) {

        System.out.println(Student.noOfStudent);
        Student st = new Student();

        Student.noOfStudent +=10;

        // with object it will work but not recommend
        System.out.println(st.noOfStudent);
    }
}
