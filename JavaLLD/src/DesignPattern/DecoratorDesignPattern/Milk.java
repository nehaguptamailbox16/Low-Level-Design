package DesignPattern.DecoratorDesignPattern;

public class Milk implements AddOns{

    Beverage b;

    public Milk(Beverage b){
        this.b = b;
    }


    @Override
    public void getDescription() {
        b.getDescription();
            System.out.println("Milk : " + getCost());
    }

    @Override
    public int getCost() {
        return b.getCost()+  15;
    }
}
