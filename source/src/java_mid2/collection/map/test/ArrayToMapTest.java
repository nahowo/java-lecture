package java_mid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        Map<String, Integer> map = new HashMap<>();

        for (String[] product : productArr) {
            map.put(product[0], Integer.valueOf(product[1]));
        }

        System.out.println(map);
    }
}
