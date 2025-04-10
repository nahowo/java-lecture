package java_mid1.exception.ex2;


public class NetworkServiceV2_1 {
    public void sendMessage(String data) throws NetworkClientException {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
