package java_mid2.collection.array;
public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

        // 숫자만 입력하기를 기대
        numberList.add(1);
        numberList.add(2);
        numberList.add("hello");

        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);
        Integer num3 = (Integer) numberList.get(2); // cannot casting; runtime exception
    }
}
