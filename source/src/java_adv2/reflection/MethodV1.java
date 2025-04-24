package java_adv2.reflection;

import java_adv2.reflection.data.BasicData;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodV1 {
    public static void main(String[] args) {
        Class<BasicData> helloClass = BasicData.class;

        System.out.println("==== methods() ====");
        Method[] methods = helloClass.getMethods(); // 본인과 상속받은 메서드 중 public 메서드만
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        Method[] declaredMethods = helloClass.getDeclaredMethods(); // 본인의 모든 메서드(상속 X)
        for (Method declaredMethod : declaredMethods) {
            System.out.println("declaredMethod = " + declaredMethod);
        }


    }
}
