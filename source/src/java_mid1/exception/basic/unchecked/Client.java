package java_mid1.exception.basic.unchecked;

public class Client {
    public void call() throws MyUncheckedException {
        throw new MyUncheckedException("ex");
    }
}
