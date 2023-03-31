import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<String, Flyweight> flyweights = new HashMap<>();

    public static Flyweight getFlyweight(String sharedState) {
        Flyweight flyweight = flyweights.get(sharedState);

        if (flyweight == null) {
            flyweight = new Flyweight(sharedState);
            flyweights.put(sharedState, flyweight);
        }

        return flyweight;
    }
}
