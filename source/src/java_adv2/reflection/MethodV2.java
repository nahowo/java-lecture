package java_adv2.reflection;

import java_adv2.reflection.data.BasicData;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodV2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 정적 메서드 호출
        BasicData helloInstance = new BasicData();
        helloInstance.call();

        // 동적 메서드 호출
        Class<? extends BasicData> helloClass = helloInstance.getClass();
        String methodName = "hello";

        Method method1 = helloClass.getDeclaredMethod(methodName, String.class);
        Object ret = method1.invoke(helloInstance, "java");
        System.out.println("return: " + ret);
    }
}
