package java_mid1.lang.clazz;

import java.lang.reflect.InvocationTargetException;

public class ClassCreateMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class helloClass = Hello.class;

        Hello hello  = (Hello) helloClass.getDeclaredConstructor().newInstance();
        System.out.println(hello.hello());
    }
}
