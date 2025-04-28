package java_adv3.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalStartMain2 {
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
        Optional<String> optName = findNameById(id);
        String name = optName.orElse("Unknown");
        System.out.println("name: " + name);
    }

    static Optional<String> findNameById(Long id) {
        String name = map.get(id);
        Optional<String> optName = Optional.ofNullable(name);
        return optName;
    }
}
