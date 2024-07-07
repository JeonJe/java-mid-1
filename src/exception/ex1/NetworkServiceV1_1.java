package exception.ex1;


public class NetworkServiceV1_1 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 networkClient = new NetworkClientV1(address);
        networkClient.initError(data);

        networkClient.connect();
        networkClient.send(data);
        networkClient.disconnect();

    }
}
