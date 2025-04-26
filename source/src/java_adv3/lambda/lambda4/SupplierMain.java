package java_adv3.lambda.lambda4;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        Supplier<Integer> supplier1 = () -> new Random().nextInt(10) + 1;
        System.out.println(supplier1.get());
    }
}
