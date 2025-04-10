package java_mid1.exception.ex1;

public class NetworkServiceV1_2 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectRet = client.connect();
        if (isError(connectRet)) { // 예외 발생 시 이후 호출 없이 return하도록 수정
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectRet);
            return;
        }

        String sendRet = client.send(data);
        if (isError(sendRet)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectRet);
            return;
        }
        client.disconnect();
    }

    private static boolean isError(String connectRet) {
        return !connectRet.equals("success");
    }
}
