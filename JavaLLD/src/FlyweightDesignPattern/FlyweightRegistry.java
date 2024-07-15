package FlyweightDesignPattern;

public interface FlyweightRegistry {

    void addFlyweight(GraphicIntrinsicState flyweight);

    GraphicIntrinsicState getFlyweight(GraphicType graphicType);
}