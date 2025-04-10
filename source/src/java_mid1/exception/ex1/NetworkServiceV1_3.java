package java_mid1.exception.ex1;

public class NetworkServiceV1_3 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectRet = client.connect();
        if (isError(connectRet)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectRet);
        } else {
            String sendRet = client.send(data);
            if (isError(sendRet)) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + connectRet);
            }
        }
        client.disconnect(); // 어떤 분기라도 호출되도록 수정
    }

    private static boolean isError(String connectRet) {
        return !connectRet.equals("success");
    }
}
