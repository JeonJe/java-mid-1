package exception.ex0.basic.checked;

public class Service {
    Client client = new Client();

    public void callCatch() {
        try {
            client.call();
        } catch (MyCheckedException e) {
            System.out.println("예외 처리 " + e.getMessage());
        }
        System.out.println("정상흐름");
    }

    public void callThrow() throws Exception {
        client.call();
    }
}
