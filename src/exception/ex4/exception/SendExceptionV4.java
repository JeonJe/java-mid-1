package exception.ex4.exception;


public class SendExceptionV4 extends RuntimeException {
    private final String sendData;

    public SendExceptionV4(String message, String address) {
        super(message);
        this.sendData = address;
    }

    public String getSendData(){
        return sendData;
    }
}
