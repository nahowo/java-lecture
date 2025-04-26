package java_adv3.lambda.lambda1;

import java_adv3.lambda.MyFunction;
import java_adv3.lambda.Procedure;

public class LambdaSimple2 {
    public static void main(String[] args) {
        Procedure procedure1 = () -> System.out.println("Hello! Lambda");
        procedure1.run();
    }
}
