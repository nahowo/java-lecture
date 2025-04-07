package java_basic.memory.static2;

public class DecoData {
    private int instanceV;
    public static int staticV;

    public static void staticCall() { // 정적 메서드
//        instanceV ++; // 인스턴스 변수 접근 불가
//        instanceMethod(); // 인스턴스 메서드 접근 불가

        staticV ++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public void instanceCall() {
        instanceV ++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticV ++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instance = " + instanceV);
    }

    private static void staticMethod() {
        System.out.println("staticV = " + staticV);
    }
}
