package ExceptionalHandling;

public class Student {

    public static int doSomething(int x) throws ClassNotFoundException, RandomException {
        //  return 1/x;   // throws error Arithmatic Exception // Unchecked Exception

        if(x == 0){
             throw new ArithmeticException();
        }else if(x%2 == 0){
            throw new ClassNotFoundException(); // This is checked exception so, caller function should know that it
            //can throw error so write " throws ClassNotFoundException " in caller function signature
        }else{
            throw new RandomException();
        }
    }
}
