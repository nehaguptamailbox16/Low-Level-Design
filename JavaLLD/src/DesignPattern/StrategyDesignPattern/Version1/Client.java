package DesignPattern.StrategyDesignPattern.Version1;

public class Client {

    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPathByMode(Mode.BIKE);
    }
}
