package java_basic.access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicF = 1;
        data.publicM();

        data.defaultF = 2;
        data.defaultM();

        // private 호출 불가능

        data.innerAccess(); // public 메서드이므로 접근 가능, innerAccess는 클래스 내부에서 정의되어 있으므로 innerAccess에서 private 호출 가능
    }
}
