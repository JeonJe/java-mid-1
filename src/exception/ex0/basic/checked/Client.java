package exception.ex0.basic.checked;

public class Client {
    public void call() throws MyCheckedException {

        throw new MyCheckedException("ex");
    }
}
