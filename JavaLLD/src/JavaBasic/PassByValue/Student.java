package JavaBasic.PassByValue;

public class Student {

    int age;
    String name;




    void printStudent(Student st){
        st.age += 10;
    }

    void printNum(int num){
        num +=20;
    }

    void printIntValue(Integer num){
        num += 10;
    }
}
