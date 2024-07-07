package exception.ex4.exception;


public class ConnectExceptionV4 extends RuntimeException {
    private final String address;

    public ConnectExceptionV4(String message, String address) {
        super(message);
        this.address = address;
    }

    public String getAddress(){
        return address;
    }
}
