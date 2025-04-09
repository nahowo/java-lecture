package java_mid1.enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        Grade[] values = Grade.values();

        System.out.println(Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("value.name() = " + value.name() + ", value.ordinal() = " + value.ordinal());
        }
    }
}
