package java_start.method;

public class Overloading2 {
    public static void main(String[] args) {
        m1(3);
        m1(3.4);
    }

    public static void m1(int a) {
        System.out.println(a);
    }

    public static void m1(double a) {
        System.out.println(a);
    }
}
