import java.util.HashMap;
import java.util.Map;

public class Flyweight {
    private String sharedState;

    public Flyweight(String sharedState) {
        this.sharedState = sharedState;
    }

    public void operation(String uniqueState) {
        String s = "Flyweight: Displaying shared (" + sharedState + ") and unique (" + uniqueState + ") state.";
        System.out.println(s);
    }
}

