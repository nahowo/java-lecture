package java_adv3.optional.model;

public class Order {
    private Long id;
    private Delivery delivery;

    public Long getId() {
        return id;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public Order(Long id, Delivery delivery) {
        this.id = id;
        this.delivery = delivery;
    }
}
