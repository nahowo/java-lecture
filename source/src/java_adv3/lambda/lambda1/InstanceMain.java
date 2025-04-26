package java_adv3.lambda.lambda1;

import java_adv3.lambda.Procedure;

public class InstanceMain {
    public static void main(String[] args) {
        Procedure procedure = new Procedure() {
            @Override
            public void run() {
                System.out.println("Hello! Lambda");
            }
        };

        System.out.println("class.class = " + procedure.getClass());
        System.out.println("class.instance = " + procedure);

        Procedure procedure1 = () -> {
            System.out.println("Hello! Lambda");
        };

        System.out.println("class.class = " + procedure1.getClass());
        System.out.println("class.instance = " + procedure1);
    }
}