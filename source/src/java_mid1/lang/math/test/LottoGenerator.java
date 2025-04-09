package java_mid1.lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int cnt = 0;
    private int[] rottoNumbers = new int[6];

    public int[] getRotto() {

        for (int i = 0; i < 6; i ++) {
            int tmp;
            while (true) {
                tmp = random.nextInt(44) + 1;
                if (!isAlreadyIn(tmp)) {
                    rottoNumbers[i] = tmp;
                    cnt ++;
                    break;
                }
            }
        }
        return rottoNumbers;
    }

    private boolean isAlreadyIn(int target) {
        for (int i = 0; i < cnt; i ++) {
            if (rottoNumbers[i] == target) {
                return true;
            }
        }
        return false;
    }
}
