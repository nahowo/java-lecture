package java_basic.access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(2);

        Item item1 = new Item("마늘", 2000, 3);
        Item item2 = new Item("상추", 3000, 4);
        Item item3 = new Item("상추", 3000, 4);

        cart.addItem(item1);
        cart.display();
        cart.addItem(item2);
        cart.display();
        cart.addItem(item3);
        cart.display();
    }
}
