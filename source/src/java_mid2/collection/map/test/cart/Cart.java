package java_mid2.collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> items = new HashMap<>();

    public void add(Product product, int quantity) {
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }

    public void minus(Product product) {
        if (items.containsKey(product)) {
            items.put(product, items.get(product) - 1);
            if (items.get(product) <= 0) {
                items.remove(product);
            }
        }
    }

    public void printAll() {
        System.out.println("==장바구니==");
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey().getName() + ": " + entry.getKey().getPrice() + "원, 수량: " + entry.getValue());
        }

        System.out.println("====");
    }
}
