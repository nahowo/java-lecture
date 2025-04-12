package java_mid2.generic.ex4;

public class GenericMethod {
    public static Object objMethod(Object t) {
        System.out.println("Object print: " + t);
        return t;
    }

    public static <T> T genericMethod(T t) {
        System.out.println("Object print: " + t);
        return t;
    }

    public static <T extends Number> T genericMethod(T t) {
        System.out.println("Object print: " + t);
        return t;
    }
}
