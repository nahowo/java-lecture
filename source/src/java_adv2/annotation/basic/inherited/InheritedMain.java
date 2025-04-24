package java_adv2.annotation.basic.inherited;

import java.lang.annotation.Annotation;

public class InheritedMain {
    public static void main(String[] args) {
        print(Parent.class);
        print(Child.class);
        print(TestInterface.class);
        print(TestInterfaceImpl.class);
    }

    private static void print(Class<?> clazz) {
        System.out.println(clazz.getSimpleName());
        for (Annotation annotation : clazz.getAnnotations()) {
            System.out.println(" - " + annotation.annotationType().getSimpleName());
        }
        System.out.println();
    }
}
