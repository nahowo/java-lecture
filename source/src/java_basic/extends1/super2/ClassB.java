package java_basic.extends1.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        // ClassA에 기본 생성자가 있으므로 super() 필요 없음
        System.out.println("ClassB 생성자의 a = " + a);
    }

    public ClassB(int a, int b) {
        // ClassA에 기본 생성자가 있으므로 super() 필요 없음
        System.out.println("ClassB 생성자의 a = " + a + ", b = " + b);
    }
}
