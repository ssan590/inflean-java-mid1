package exception.basic.unchecked;

/**
 * Exception을 상속받은 예외는 체크 예외가 된다.
 */
public class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}
