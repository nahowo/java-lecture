package java_start.scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) {
            System.out.println("m = " + m);
            System.out.println("i = " + i);
        }
//        System.out.println("i = " + i); // 접근 불가
        System.out.println("m = " + m);
    }
}
