import java.util.HashMap;
import java.util.Map;

public class Variables {

    private Map<Variable, Integer> map = new HashMap<>();

    public void put(Variable variable, int value) {
        map.put(variable, value);
    }

    public int get(Variable variable) {
        return map.get(variable);
    }
}
