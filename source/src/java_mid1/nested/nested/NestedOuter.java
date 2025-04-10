package java_mid1.nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    static int outClassValue2 = 4;
    private int outInstanceValue = 2;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            System.out.println(nestedInstanceValue);
//            System.out.println(outInstanceValue); // Nested가 static이므로 non-static 변수인 outInstanceValue 접근 불가
            System.out.println(outClassValue); // 바깥 클래스의 멤버 변수는 접근 가능
        }
    }
}