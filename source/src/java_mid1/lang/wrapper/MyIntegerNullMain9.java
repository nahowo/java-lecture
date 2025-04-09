package java_mid1.lang.wrapper;

public class MyIntegerNullMain9 {
    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1), new MyInteger(2)};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));
    }

    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger i : intArr) {
            if (i.getValue() == target) {
                return i;
            }
        }
        return null; // 기본형을 사용하면 "찾지 못함"을 표현할 방법이 없음
    }
}
