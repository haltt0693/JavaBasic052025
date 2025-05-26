package Collection;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        Map<Integer, Double> map2 = new HashMap<>();
        // Them du lieu
        map1.put("key1", "value1");
        map1.put("language", "Java");
        map2.put(3, 89D);

        System.out.println("Map 1: " + map1);
        System.out.println("Map 2: " + map2);
    }
}
