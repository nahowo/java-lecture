package java_adv2.reflection;

import java_adv2.reflection.data.Calculator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MethodV3 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("호출 메서드: ");
        String methodName = scanner.nextLine();

        System.out.print("숫자 1: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.print("숫자 2: ");
        int b = scanner.nextInt();
        scanner.nextLine();

        Calculator calculator = new Calculator();
        Class<? extends Calculator> calculatorClass = calculator.getClass();
        Method method = calculatorClass.getDeclaredMethod(methodName, int.class, int.class);

        Object ret = method.invoke(calculator, a, b);
        System.out.println("ret = " + ret);
    }
}
