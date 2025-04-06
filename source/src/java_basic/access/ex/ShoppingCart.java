package java_basic.access.ex;

public class ShoppingCart {
    private int count;
    private int max;
    private Item[] items;

    public ShoppingCart(int max) {
        this.max = max;
        this.items = new Item[max];
    }

    public void addItem(Item item) {
        if (count >= max) {
            System.out.println("장바구니가 가득 찼습니다. ");
            return;
        }
        items[count ++] = item;
    }

    public void display() {
        for (int i = 0; i < count; i ++) {
            items[i].printItem();
        }
    }
}
