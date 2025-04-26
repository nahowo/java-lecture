package java_adv3.lambda.lambda1;

import java_adv3.lambda.MyFunction;

public class LambdaSimple4 {
    public static void main(String[] args) {
        MyCall myCall1 = (value) -> value * 2;
        MyCall myCall2 = value -> value * 2;
        System.out.println(myCall2.call(4));
    }

    interface MyCall {
        int call(int value);
    }
}
