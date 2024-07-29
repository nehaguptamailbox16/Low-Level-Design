package DesignPattern.DecoratorDesignPattern;

public class HouseBlend  implements Beverage{
    @Override
    public void getDescription() {
        System.out.println("HouseBlend : "+ getCost());
    }

    @Override
    public int getCost() {
        return 100;
    }
}
