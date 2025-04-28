package java_adv3.optional;

import java.util.Optional;
import java.util.Random;

public class OrElseGetMain {
    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.of(100);
        Optional<Integer> o2 = Optional.empty();

        System.out.println("o1.orElse(10 + 20) = " + o1.orElse(10 + 20));
        System.out.println("o2.orElse(10 + 20) = " + o2.orElse(10 + 20));

//        System.out.println("o1.orElse(createData()) = " + o1.orElse(createData())); // createData() 를 실행하지만 사용하지는 않음
//        System.out.println("o2.orElse(createData()) = " + o2.orElse(createData()));

        System.out.println("==지연 실행==");
        System.out.println("o1.orElseGet(() -> createData()) = " + o1.orElseGet(() -> createData()));
        System.out.println("o2.orElseGet(() -> createData()) = " + o2.orElseGet(() -> createData()));
    }

    static int createData() {
        System.out.println("데이터를 생성합니다...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int i = new Random().nextInt(100);
        System.out.println("데이터를 생성했습니다: " + i);
        return i;
    }
}
