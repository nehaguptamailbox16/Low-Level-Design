package DesignPattern.DecoratorDesignPattern;

public class DarkRoast implements Beverage{
    @Override
    public void getDescription() {
        System.out.println("Dark Roast : " + getCost());
    }

    @Override
    public int getCost() {
        return 150;
    }
}
