package java_adv3.lambda.lambda3;

public class TargetType1 {
    public static void main(String[] args) {
        FunctionA functionA = i -> "value = " + i;
        System.out.println(functionA.apply(10));
        FunctionB functionB = i -> "value = " + i;

//        FunctionB targetB = functionA; // 컴파일 오류

    }

    @FunctionalInterface
    interface FunctionA {
        String apply(Integer integer);
    }

    @FunctionalInterface
    interface FunctionB {
        String apply(Integer integer);
    }
}
