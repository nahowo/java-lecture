package java_mid1.exception.ex2;

public class NetworkClientException extends Exception{
    private String errorCode;

    public NetworkClientException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
