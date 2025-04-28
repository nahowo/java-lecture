package java_adv3.optional;

import java_adv3.optional.model.Address;
import java_adv3.optional.model.User;

public class AddressMain1 {
    public static void main(String[] args) {
        User user1 = new User("Park", null);
        User user2 = new User("Lee", new Address("lee street"));

        printStreet(user1);
        printStreet(user2);
    }

    private static void printStreet(User user) {
        String userStree = getUserStreet(user);
        if (userStree == null) {
            System.out.println("Unknown");
        } else {
            System.out.println(userStree);
        }
    }

    static String getUserStreet(User user) {
        if (user == null) {
            return null;
        }
        Address address = user.getAddress();
        if (address == null) {
            return null;
        }

        return address.getStreet();
    }
}
