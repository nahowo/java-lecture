package java_mid1.exception.basic.checked;

public class Service {
    Client client = new Client();

    public void callCatch() {
        try {
            client.call(); // 받은 예외를 처리
        } catch (MyCheckedException e) {
            System.out.println("예외 처리, " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    public void catchThrow() throws MyCheckedException { // 받은 예외를 다시 던짐
        client.call();
    }
}
