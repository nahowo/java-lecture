package java_mid1.lang.immutable.address;

public class RefMain2_1 {
    public static void main(String[] args) {
        ImmutableAddress addressA = new ImmutableAddress("서울");
        ImmutableAddress addressB = addressA;

        System.out.println("addressA = " + addressA);
        System.out.println("addressB = " + addressB);

//        addressB.setValue("부산"); // 변경 불가능
        addressB = new ImmutableAddress("부산");
        System.out.println("addressA = " + addressA);
        System.out.println("addressB = " + addressB);
    }
}
