package java_basic.poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.parentMethod();

        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        Parent poly = new Child();
        poly.parentMethod();
//        poly.childMethod(); // 상위 타입은 하위 타입의 메서드를 알 수 없음
    }
}
