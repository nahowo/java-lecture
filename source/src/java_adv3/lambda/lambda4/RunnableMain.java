package java_adv3.lambda.lambda4;

public class RunnableMain {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("hello runnable");
        runnable.run();
    }
}
