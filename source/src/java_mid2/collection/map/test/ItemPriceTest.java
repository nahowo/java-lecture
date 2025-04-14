package java_mid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("딸기", 1000);
        map.put("망고", 1000);
        map.put("바나나", 500);

        int targetPrice = 1000;
        System.out.println(targetPrice + "원짜리 음식은 아래와 같습니다. ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == targetPrice) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + "원");
            }
        }
    }
}
