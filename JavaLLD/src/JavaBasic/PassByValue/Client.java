package JavaBasic.PassByValue;

public class Client {
    public static void main(String[] args) {
        Student st = new Student();
        st.age = 20;

        Student st1 = new Student();
        st1.printStudent(st);


        //why "st" object age is changed value. because we pass the student reference in function printStudent
        //It will point to same memory address
        //JAVA DOESNT SUPPORT "Pass By Reference
        System.out.println(st.age);  // 30

        int num = 20;
        st.printNum(num);

        // num value does not change because of Pass by value. both variable is different
        System.out.println(num);  //20

        Integer num2 = 20;
        st.printIntValue(num2);

        System.out.println(num2);
    }
}
