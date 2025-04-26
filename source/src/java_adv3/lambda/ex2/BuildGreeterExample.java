package java_adv3.lambda.ex2;


import java_adv3.lambda.ex2.MappingExample.MyFunction;

public class BuildGreeterExample {
    public static void main(String[] args) {
        MyFunction helloFunction = buildGreeter("Hello");
        MyFunction hiFunction = buildGreeter("Hi");
        System.out.println(helloFunction.apply("java"));
        System.out.println(hiFunction.apply("Lambda"));
    }

    static MyFunction buildGreeter(String greeting) {
        return (str) -> greeting + ", " + str;
    }
}