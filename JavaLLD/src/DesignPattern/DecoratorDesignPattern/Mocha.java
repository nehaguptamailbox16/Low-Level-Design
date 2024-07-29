package DesignPattern.DecoratorDesignPattern;

public class Mocha implements AddOns{
    Beverage b;

    public Mocha(Beverage b){
            this.b = b;
    }

    @Override
    public void getDescription() {
        b.getDescription();
        System.out.println("Mocha : "+ getCost());

    }

    @Override
    public int getCost() {
        return b.getCost() +   20;
    }
}
