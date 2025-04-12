package java_mid2.generic.ex5;

public class EraserBox<T> {
    public boolean instanceCheck(Object param) {
//        return param instanceof T; // 컴파일 오류
        return true;
    }

    public T create() {
//        return new T(); // 컴파일 오류
        return null;
    }
}
