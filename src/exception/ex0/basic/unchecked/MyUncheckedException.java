package exception.ex0.basic.unchecked;

public class MyUncheckedException extends RuntimeException{
    public MyUncheckedException(String message){
       super(message);
    }
}
