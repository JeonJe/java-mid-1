package exception.ex3.exception;


public class NetworkServiceV3_1 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 networkClient = new NetworkClientV3(address);
        networkClient.initError(data);

        try {
            networkClient.connect();
            networkClient.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 오류 주소 :" + e.getAddress() + "오류 메시지 : " + e.getMessage());
        } catch (SendExceptionV3 e){
            System.out.println("[연결 오류] 오류 데이터 :" + e.getSendData() + "오류 메시지 : " + e.getMessage());
        } finally {
            networkClient.disconnect();
        }
    }
}
