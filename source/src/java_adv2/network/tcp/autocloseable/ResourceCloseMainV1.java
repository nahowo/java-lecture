package java_adv2.network.tcp.autocloseable;

public class ResourceCloseMainV1 {
    public static void main(String[] args) {
        try {
            logic();
        } catch (CallException e) {
            System.out.println("CallException 예외처리");
            throw new RuntimeException(e);
        } catch (CloseException e) {
            System.out.println("CloseException 예외처리");
            throw new RuntimeException(e);
        }
    }
    public static void logic() throws CallException, CloseException {
        ResourceV1 resource1 = new ResourceV1("resource1");
        ResourceV1 resource2 = new ResourceV1("resource2");

        resource1.call();
        resource2.callEx(); // 예외 터짐

        System.out.println("자원 정리"); // 호출 안됨
        resource2.closeEx(); // 호출 안됨
        resource1.close(); // 호출 안됨
    }
}
