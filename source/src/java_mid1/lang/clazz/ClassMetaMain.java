package java_mid1.lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = String.class;
//        Class clazz1 = new String().getClass();
//        Class clazz2 = Class.forName("java.lang.String");

        // 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType() + " " + field.getName());
        }

        // 메서드 출력
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        // 상위 클래스 정보 출력
        System.out.println(clazz.getSuperclass().getName());

        // 인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }
    }
}
