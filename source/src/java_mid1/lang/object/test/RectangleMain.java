package java_mid1.lang.object.test;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(100, 20);
        Rectangle r2 = new Rectangle(100, 20);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println(r1 == r2);
        System.out.println(r1.equals(r2));
    }
}