package java_basic.oop1.ex;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setUp(3, 3);
        System.out.println("r.isSquare() = " + r.isSquare());
        System.out.println("width = " + r.getWidth());
        System.out.println("height = " + r.getHeight());
        System.out.println("area = " + r.getArea());
    }
}
