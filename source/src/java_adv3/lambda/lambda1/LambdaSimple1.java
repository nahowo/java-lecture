package java_adv3.lambda.lambda1;

import java_adv3.lambda.MyFunction;

public class LambdaSimple1 {
    public static void main(String[] args) {
        MyFunction myFunction1 = (int a, int b) -> {
            return a + b;
        };
        System.out.println("function1: " + myFunction1.apply(1, 2));

        // 단일 표현식인 경우 중괄호, 리턴 생략 가능
        MyFunction myFunction2 = (int a, int b) -> a + b;
        System.out.println("function2: " + myFunction2.apply(1, 2));

    }
}
