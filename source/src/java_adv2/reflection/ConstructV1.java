package java_adv2.reflection;

import java.lang.reflect.Constructor;

public class ConstructV1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("java_adv2.reflection.data.BasicData");

        System.out.println("==== constructors() ====");
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("constructor = " + constructor);
        }

        System.out.println("==== declaredConstructors() ====");
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConst : declaredConstructors) {
            System.out.println("declaredConst = " + declaredConst);
        }


    }
}
