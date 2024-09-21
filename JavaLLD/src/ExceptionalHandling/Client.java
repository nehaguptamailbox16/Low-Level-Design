package ExceptionalHandling;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, RandomException {

        Student.doSomething(0);




        try{
            Student.doSomething(0);
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch (RandomException e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("End");
        }

    }
}
