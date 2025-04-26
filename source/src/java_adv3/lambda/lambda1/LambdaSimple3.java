package java_adv3.lambda.lambda1;

import java_adv3.lambda.MyFunction;
import java_adv3.lambda.Procedure;

public class LambdaSimple3 {
    public static void main(String[] args) {
        MyFunction myFunction1 = (a, b) -> a + b;
        int ret = myFunction1.apply(1, 2);
        System.out.println("ret = " + ret);
    }
}
