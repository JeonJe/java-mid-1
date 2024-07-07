package exception.ex0.basic.unchecked;

public class Service {
    Client client = new Client();
    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            System.out.println("예외 처리 " + e.getMessage());
        }
        System.out.println("정상흐름");
    }

    public void callThrow() {
        client.call();
    }
}
