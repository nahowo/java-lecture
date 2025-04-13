package java_mid2.collection.list.test.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item i) {
        items.add(i);
    }

    public void diplayItems() {
        for (Item item : items) {
            System.out.println("상품명: " + item.getName() + ", 총 가격: " + item.getTotalPrice());
        }
    }

    public int getTotalPrice() {
        int total = 0;
        for (Item item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }
}
