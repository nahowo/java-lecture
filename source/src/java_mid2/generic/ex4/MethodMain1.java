package java_mid2.generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Integer integer = (Integer) GenericMethod.objMethod(i); // Integer로 캐스팅해야 함
        System.out.println("integer = " + integer);


        Integer integer1 = GenericMethod.<Integer>genericMethod(i);
        System.out.println("integer1 = " + integer1);

        Double double1 = GenericMethod.<Double>genericMethod(20.8);
        System.out.println("double1 = " + double1);
    }
}
