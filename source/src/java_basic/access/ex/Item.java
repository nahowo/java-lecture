package java_basic.access.ex;

public class Item {
    private String name;
    private int price;
    private int count;

    public Item(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    void printItem() {
        System.out.println("물건: " + name + ", 가격: " + price + ", 개수: " + count);
    }
}
