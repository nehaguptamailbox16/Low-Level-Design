package JavaBasic.Static;

public class Student {

    int age;
    String name;
    static int noOfStudent = 10;

    static{
        noOfStudent = 90;
    }

    static int getNoOfStudent(){
        // not static member or function is not allowed in static function;
        //age = 20;
        //this.age = 10;  "this" keyword not allowed in static function
        return noOfStudent;
    }
}
