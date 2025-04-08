package java_mid1.lang.immutable.address;

public class PrimitiveMain {
    public static void main(String[] args) {
        int a = 10;
        int b = a; // 값을 복사해 대입

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;
        System.out.println("a = " + a); // a에는 영향 없음
        System.out.println("b = " + b);
    }
}
