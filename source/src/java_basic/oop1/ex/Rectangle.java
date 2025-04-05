package java_basic.oop1.ex;

public class Rectangle {
    int width;
    int height;
    int area;

    void setUp(int width, int height) {
        this.width = width;
        this.height = height;
        area = width * height;
    }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }

    int getArea() {
        return area;
    }

    boolean isSquare() {
        return width == height;
    }
}
