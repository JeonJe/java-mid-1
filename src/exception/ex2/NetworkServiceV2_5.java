package exception.ex2;

public class NetworkServiceV2_5 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 networkClient = new NetworkClientV2(address);
        networkClient.initError(data);

        try {
            networkClient.connect();
            networkClient.send(data);
        } catch (NetWorkClientExceptionV2 e) {
            System.out.println("[오류] 코드:" + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally {
            networkClient.disconnect();
        }
    }
}
