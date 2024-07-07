package exception.ex1;


public class NetworkServiceV1_2 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 networkClient = new NetworkClientV1(address);
        networkClient.initError(data);

        String connectResult = networkClient.connect();
        if(isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
            return;
        }
        String sendResult = networkClient.send(data);
        if(isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
            return;
        }
        networkClient.disconnect();

    }

    private boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
