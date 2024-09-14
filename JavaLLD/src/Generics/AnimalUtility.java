package Generics;

import java.util.List;

public class AnimalUtility {

    public static void printAnimal(List<Animal> animals){
        for(Animal animal : animals){
            System.out.println(animal);
        }
    }

    public static <T extends Animal> void printAnimalWithGenerics(List<T> animals){
        for(Animal animal : animals){
            System.out.println(animal);
        }
    }

    public static  void printAnimalWithGenerics2(List<? extends Animal> animals){
        for(Animal animal : animals){
            System.out.println(animal);
        }
    }

    public static  void printAnimalWithGenerics3(List<? super Dog> animals){
        for(Object animal : animals){
            System.out.println(animal);
        }
    }
}
