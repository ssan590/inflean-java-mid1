package exception.basic.unchecked;

public class Client {
//    public void call() throws MyUncheckedException { throws 생략 가능
    public void call() throws MyUncheckedException {
        throw new MyUncheckedException("ex");
    }
}
