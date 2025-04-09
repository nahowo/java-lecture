package java_mid1.lang.math.test;

import java.util.Arrays;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lg1 = new LottoGenerator();
        System.out.println(Arrays.toString(lg1.getRotto()));
        LottoGenerator lg2 = new LottoGenerator();
        System.out.println(Arrays.toString(lg2.getRotto()));
        LottoGenerator lg3 = new LottoGenerator();
        System.out.println(Arrays.toString(lg3.getRotto()));

    }
}
