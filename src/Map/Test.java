package Map;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i <= 16; i++) {
            map.put(i, "" + i);
        }
        System.out.println(map);

        System.out.println("//////");

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(16, 1.1f, true);
        for (int i = 16; i >= 0; i--) {
            linkedHashMap.put(i, "" + i);
        }
        linkedHashMap.get(3);
        linkedHashMap.get(7);
        linkedHashMap.get(4);
        linkedHashMap.get(5);
        linkedHashMap.get(15);
        System.out.println(linkedHashMap);
    }
}


