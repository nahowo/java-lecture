package java_basic.extends1.super2;

public class ClassC extends ClassB {
    public ClassC(int a) {
//        System.out.println("hello world"); // 부모 생성자는 자식 생성자 메서드의 첫 줄에 실행
//        super(); // ClassB에는 기본 생성자가 없기 때문에 컴파일 오류
        super(a);
        System.out.println("ClassC 생성자");
    }
}
