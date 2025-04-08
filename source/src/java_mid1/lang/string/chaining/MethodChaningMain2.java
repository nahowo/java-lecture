package java_mid1.lang.string.chaining;

public class MethodChaningMain2 {
    public static void main(String[] args) {
        ValueAdder valueAdder = new ValueAdder();
        int result = valueAdder.add(1).add(2).add(3).getValue();

        System.out.println(result);
    }
}
