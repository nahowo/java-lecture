package java_adv3.lambda.lambda2;

import java_adv3.lambda.MyFunction;

public class LambdaPassMain2 {
    public static void main(String[] args) {
        MyFunction add = (a, b) -> a + b;
        MyFunction sub = (a, b) -> a - b;

        System.out.println("변수를 통해 전달");
        calc(add);
        calc(sub);

        System.out.println("람다 직접 전달");
        calc((a, b) -> a + b);
        calc((a, b) -> a - b);
    }

    static void calc(MyFunction myFunction) {
        int a = 1;
        int b = 2;
        System.out.println("계산 시작");
        int ret = myFunction.apply(a, b);
        System.out.println("ret = " + ret);
    }
}
