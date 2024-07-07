package exception.ex3.exception;

public class SendExceptionV3 extends NetworkClientExceptionV3{
    private final String sendData;

    public SendExceptionV3(String message, String address) {
        super(message);
        this.sendData = address;
    }

    public String getSendData(){
        return sendData;
    }
}
