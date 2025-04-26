package java_adv3.lambda.ex1;

import java_adv3.lambda.MyFunction;

public class M5Return {
    public static void main(String[] args) {
        System.out.println("add(1, 2) = " + getOperation("add").apply(1, 2));
        System.out.println("sub(1, 2) = " + getOperation("sub").apply(1, 2));
        System.out.println("multi(1, 2) = " + getOperation("multi").apply(1, 2));
    }
    static MyFunction getOperation(String operator) {
        switch (operator) {
            case "add":
                return (a, b) -> a + b;
            case "sub":
                return (a, b) -> a - b;
            default:
                return (a, b) -> 0;
        }
    }
}
