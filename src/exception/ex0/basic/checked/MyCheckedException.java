package exception.ex0.basic.checked;

public class MyCheckedException extends Exception{

    public MyCheckedException(String message) {
        super(message); //부모에 보관
    }
}
