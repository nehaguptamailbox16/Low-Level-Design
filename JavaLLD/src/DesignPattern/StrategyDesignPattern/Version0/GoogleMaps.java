package DesignPattern.StrategyDesignPattern.Version0;

public class GoogleMaps {


    // Here OCP & SCP is violated

    void findPathByMode(Mode mode){
        if(mode == Mode.CAR){
            System.out.print("Car");
        }else  if(mode == Mode.BIKE){
            System.out.print("Bike");
        }else  if(mode == Mode.WALK){
            System.out.print("Walk");
        }
    }
}
