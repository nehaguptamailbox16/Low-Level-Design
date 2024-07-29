package DesignPattern.StrategyDesignPattern.Version1;

public class BikePathCal implements PathCal{
    @Override
    public void findPath() {
        System.out.println("Bike path");
    }
}
