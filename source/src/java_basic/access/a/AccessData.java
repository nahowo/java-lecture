package java_basic.access.a;

public class AccessData {
    public int publicF;
    int defaultF;
    private int privateF;

    public void publicM() {
        System.out.println("public 호출: " + publicF);
    }

    void defaultM() {
        System.out.println("default 호출: " + defaultF);
    }

    private void privateM() {
        System.out.println("private 호출: " + privateF);
    }

    public void innerAccess() { // 클래스 내부에서는 전부 접근 가능
        System.out.println("내부 호출");
        publicF = 100;
        defaultF = 200;
        privateF = 300;
        publicM();
        defaultM();
        privateM();
    }
}
