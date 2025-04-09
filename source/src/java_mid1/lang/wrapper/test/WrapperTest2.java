package java_mid1.lang.wrapper.test;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] strs = {"10.0", "20.2", "2.9"};

        double sum = 0L;
        for (String str : strs) {
            sum += Double.parseDouble(str);
        }
        System.out.println("sum = " + sum);
    }
}
