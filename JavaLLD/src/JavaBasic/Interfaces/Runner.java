package JavaBasic.Interfaces;

public interface Runner {


        int num = 5; // data member is allowed. by default, it will be Static, Final, Public

    // Every function is public in interface by default
    void run();



    //Default Method
    default void walk(){
        System.out.println("walk");
    }
}
