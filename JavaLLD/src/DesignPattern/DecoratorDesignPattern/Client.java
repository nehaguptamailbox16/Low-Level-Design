package DesignPattern.DecoratorDesignPattern;

public class Client {

    public static void main(String[] args) {

        //Double mocha dark roast with added milk

        Beverage beverage = new DarkRoast();
       // beverage.getDescription();

        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);

        beverage.getDescription();
    }
}
