package java_adv3.optional;

import java_adv3.optional.model.Delivery;
import java_adv3.optional.model.Order;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class DeliveryMain {
    static Map<Long, Order> orderRepository = new HashMap<>();
    static {
        orderRepository.put(1L, new Order(1L, new Delivery("배송완료", false)));
        orderRepository.put(2L, new Order(2L, new Delivery("배송중", false)));
        orderRepository.put(3L, new Order(3L, new Delivery("배송중", true)));
        orderRepository.put(4L, new Order(4L, null));
    }
    public static void main(String[] args) {
        System.out.println("getDeliveryStatus(1L) = " + getDeliveryStatus(1L));
        System.out.println("getDeliveryStatus(2L) = " + getDeliveryStatus(2L));
        System.out.println("getDeliveryStatus(3L) = " + getDeliveryStatus(3L));
        System.out.println("getDeliveryStatus(4L) = " + getDeliveryStatus(4L));
    }

    private static String getDeliveryStatus(long id) {
        return findOrder(id)
                .map(Order::getDelivery)
                .filter(delivery -> !delivery.isCanceled())
                .map(Delivery::getStaus)
                .orElseGet(() -> "배송 취소");
    }

    static Optional<Order> findOrder(Long orderId) {
        return Optional.ofNullable(orderRepository.get(orderId));
    }
}
