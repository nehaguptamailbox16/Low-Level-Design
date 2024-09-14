package Generics;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>();
        Pair<Integer, Boolean> p2 = new Pair<>();


        Pair.doSomething("Neha");

        //int c = Pair.doSomething("Neha"); // not possible because in parameter already told its String




        List<Dog> dog = new ArrayList<>();
        dog.add(new Dog("Bob"));
        dog.add(new Dog("Alice"));

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Bob"));
        animals.add(new Dog("Alice"));

    //    AnimalUtility.printAnimal(dog); // ERROR : java: incompatible types: java.util.List<Generics.Dog> cannot be converted to java.util.List<Generics.Animal>

        AnimalUtility.printAnimalWithGenerics(dog);
    }
}
