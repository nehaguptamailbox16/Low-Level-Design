package StrategyDesignPattern.Version1;

public class PathCalStrategyFactory {
    static PathCal findPathByMode(Mode mode){
        PathCal path = null;
        if(mode == Mode.CAR){
            path = new CarPathCal();
        }else  if(mode == Mode.BIKE){
            path = new BikePathCal();
        }else  if(mode == Mode.WALK){
            path = new WalkPathCal();
        }
        return path;
    }
}
