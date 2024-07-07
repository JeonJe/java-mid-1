package exception.ex4.exception;



public class NetworkServiceV5 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV5 networkClient = new NetworkClientV5(address);
        networkClient.initError(data);

        try (NetworkClientV5 networkClient = new NetworkClientV5(address)){
            networkClient.connect();
            networkClient.send(data);
        } finally {
            networkClient.disconnect();
        }
    }
}
