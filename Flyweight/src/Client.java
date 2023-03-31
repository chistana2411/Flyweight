public class Client {
    public static void main(String[] args) {
        Flyweight flyweight1 = FlyweightFactory.getFlyweight("sharedState");
        Flyweight flyweight2 = FlyweightFactory.getFlyweight("sharedState");
        Flyweight flyweight3 = FlyweightFactory.getFlyweight("sharedState");

        flyweight1.operation("uniqueState1");
        flyweight2.operation("uniqueState2");
        flyweight3.operation("uniqueState3");
    }
}
