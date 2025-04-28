package java_adv3.optional;

import java_adv3.optional.model.Address;
import java_adv3.optional.model.User;

import java.util.Optional;

public class AddressMain2 {
    public static void main(String[] args) {
        User user1 = new User("Park", null);
        User user2 = new User("Lee", new Address("lee street"));

        printStreet(user1);
        printStreet(user2);
    }

    private static void printStreet(User user) {
        getUserStreet(user).ifPresentOrElse(
                System.out::println,
                () -> System.out.println("unknown")
        );
    }

    static Optional<String> getUserStreet(User user) {
        return Optional.ofNullable(user)
                .map(User::getAddress)
                .map(Address::getStreet); // map 체이닝 중간에 null이 등장하면 Optional.empty() 반환
        // 메서드 체이닝 자체를 람다로 연결해야 함, 메서드 체이닝을 하나의 람다로 처리하면 NPE
    }
}
