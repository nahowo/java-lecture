package java_mid1.lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity: " + (user1 == user2));
        System.out.println("equality: " + (user1.equals(user2)));

        UserV2 user3 = new UserV2("id-100");
        UserV2 user4 = new UserV2("id-100");

        System.out.println("identity: " + (user3 == user4));
        System.out.println("equality: " + (user3.equals(user4)));
    }
}
