package java_mid2.generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox(); // 타입 선언을 생략하면 타입 인자가 Object로 들어감
        integerBox.setValue(10);

    }
}
