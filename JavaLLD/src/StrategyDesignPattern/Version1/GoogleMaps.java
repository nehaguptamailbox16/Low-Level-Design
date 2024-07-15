package StrategyDesignPattern.Version1;

public class GoogleMaps {



    void findPathByMode(Mode mode){
        //It is still violating the OCP to resolve this we will create factory method.

//        PathCal path;
//        if(mode == Mode.CAR){
//            path = new CarPathCal();
//            path.findPath();
//        }else  if(mode == Mode.BIKE){
//            path = new BikePathCal();
//            path.findPath();
//        }else  if(mode == Mode.WALK){
//            path = new WalkPathCal();
//            path.findPath();
//        }



      // Now it is OCP, SRP, Dependency inversion free.
       PathCal p =  PathCalStrategyFactory.findPathByMode(mode);
       p.findPath();
    }
}
