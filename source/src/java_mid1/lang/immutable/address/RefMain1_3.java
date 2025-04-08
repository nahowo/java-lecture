package java_mid1.lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        Address addressA = new Address("서울");
        Address addressB = addressA;

        System.out.println("addressA = " + addressA);
        System.out.println("addressB = " + addressB);

        change(addressB, "부산");

        System.out.println("addressA = " + addressA);
        System.out.println("addressB = " + addressB);
    }

    private static void change(Address address, String changeAddress) {
        System.out.println("주소를 변경합니다. " + changeAddress);
        address.setValue(changeAddress);
    }
}
