package java_mid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        Map<String, Integer> map = new HashMap<>();

        String[] strs = text.split(" ");
        for (String str : strs) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        System.out.println(map);
    }
}
