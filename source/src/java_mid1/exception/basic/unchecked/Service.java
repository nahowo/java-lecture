package java_mid1.exception.basic.unchecked;

public class Service {
    Client client = new Client();

    public void callCatch() {
        try {
            client.call(); // 받은 예외를 처리
        } catch (MyUncheckedException e) {
            System.out.println("예외 처리, " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    public void callThrow() { // 받은 예외를 throws로 던지지 않아도 컴파일 오류X, 자동으로 던짐
        client.call();
    }
}
