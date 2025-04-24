package java_adv2.reflection;

import java_adv2.reflection.data.BasicData;

import java.lang.reflect.Field;

public class FieldV1 {
    public static void main(String[] args) {
        Class<BasicData> helloClass = BasicData.class;

        System.out.println("== fields =="); // 본인과 상속받은 public fields
        Field[] fields = helloClass.getFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }

        System.out.println("== declared fields =="); // 본인의 모든 fields
        Field[] declaredFields = helloClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField);
        }
    }
}
