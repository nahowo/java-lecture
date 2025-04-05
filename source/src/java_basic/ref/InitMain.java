package java_basic.ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("data.value1 = " + data.value1);
        System.out.println("data.value2 = " + data.value2);

        int a;
        // System.out.println("a = " + a); // 컴파일 오류
    }
}
