package java_mid2.generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerGenericBox = new GenericBox<>(); // 생성 시점에 T의 타입 결정
//        integerGenericBox.setValue("hello"); // 타입 안정성 보장
        integerGenericBox.setValue(100); // 타입 안정성 보장
        Integer integer = integerGenericBox.getValue(); // casting 필요 없음
        System.out.println("integer = " + integer);

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.setValue("hello");
        String string = stringGenericBox.getValue();
        System.out.println("string = " + string);
    }
}
