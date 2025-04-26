package java_adv3.lambda.lambda2;

import java_adv3.lambda.MyFunction;

public class LambdaPassMain1 {
    public static void main(String[] args) {
        MyFunction add = (a, b) -> a + b;
        MyFunction sub = (a, b) -> a - b;
        System.out.println("add.apply(1, 2) = " + add.apply(1, 2));
        System.out.println("sub.apply(1, 2) = " + sub.apply(1, 2));

        MyFunction call = add;
        System.out.println("call.apply(1, 2) = " + call.apply(1, 2));
    }
}
