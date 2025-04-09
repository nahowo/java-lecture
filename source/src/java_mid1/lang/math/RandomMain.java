package java_mid1.lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random(1); // seed값이 동일하면 random 값이 같음

        int i = random.nextInt();
        System.out.println(i);

        System.out.println(random.nextDouble());
        System.out.println(random.nextBoolean());

        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10) + 1);

    }
}
