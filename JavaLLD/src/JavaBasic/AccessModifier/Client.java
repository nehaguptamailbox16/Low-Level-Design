package JavaBasic.AccessModifier;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.age = 35;
        System.out.println(s.age);

        Student y = s;
        y.age = y.age +10;
        System.out.println(y.age);
        System.out.println(s.age);


        // private access so this is giving error.
      //  System.out.println(y.name);

        // So to access private data member create Getter & Setter;
        y.setName("Neha");
        System.out.println(y.getName());
        

    }
}
