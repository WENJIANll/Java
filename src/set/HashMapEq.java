package set;

import java.util.HashMap;
import java.util.Map;

public class HashMapEq {
    public static void main(String[] args) {
        String key1 = "a";
        Map<String, String> map = new HashMap<>();
        map.put(key1, "wenjian");

        String key2 = new String("a");
        System.out.println(map.get(key2));
    }
}
