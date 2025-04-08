package java_mid1.lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        Address addressA = new Address("서울");
        Address addressB = addressA;

        System.out.println("addressA = " + addressA);
        System.out.println("addressB = " + addressB);

        addressB.setValue("부산");

        System.out.println("addressA = " + addressA);
        System.out.println("addressB = " + addressB);
    }
}
