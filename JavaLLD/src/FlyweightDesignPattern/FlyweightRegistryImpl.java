package FlyweightDesignPattern;

import java.util.*;

public class FlyweightRegistryImpl implements FlyweightRegistry {

    private Map<GraphicType, GraphicIntrinsicState> map = new HashMap<>();

    @Override
    public void addFlyweight(GraphicIntrinsicState flyweight){
        map.put(flyweight.getType() ,flyweight);
    }

    @Override
    public GraphicIntrinsicState getFlyweight(GraphicType graphicType){
        return map.get(graphicType);
    }
}
