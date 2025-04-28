package java_adv3.optional;

import java.util.HashMap;
import java.util.Map;

public class OptionalStartMain1 {
    private static final Map<Long, String> map = new HashMap<>();

    static {
        map.put(1L, "Park");
        map.put(2L, "Lee");
    }
    public static void main(String[] args) {
        findAndPrint(1L);
        findAndPrint(3L);

    }

    static void findAndPrint(Long id) {
        String name = findNameById(id);
        if (name == null) {
            System.out.println("name not found");
        } else {
            System.out.println("name: " + name.toUpperCase());
        }
    }

    static String findNameById(Long id) {
        return map.get(id);
    }
}
