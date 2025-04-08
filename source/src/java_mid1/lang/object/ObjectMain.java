package java_mid1.lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        String str = child.toString(); // Object 클래스의 toString() 메서드 실행
        System.out.println("str = " + str);
    }
}
