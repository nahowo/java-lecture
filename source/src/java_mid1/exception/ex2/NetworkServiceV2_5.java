package java_mid1.exception.ex2;


public class NetworkServiceV2_5 {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientException e) {
            System.out.println("[Exception] code: " + e.getErrorCode() + ", message: " + e.getMessage());
        }
        finally {
            client.disconnect();
        }
    }
}
