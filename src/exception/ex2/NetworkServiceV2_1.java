package exception.ex2;

public class NetworkServiceV2_1 {
    public void sendMessage(String data) throws NetWorkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV2 networkClient = new NetworkClientV2(address);
        networkClient.initError(data);

        networkClient.connect();
        networkClient.send(data);
        networkClient.disconnect();

    }
}
