package java_mid1.lang.string.chaining;

public class MethodChaningMain1 {
    public static void main(String[] args) {
        ValueAdder valueAdder = new ValueAdder();
        ValueAdder adder1 = valueAdder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);

        System.out.println(adder3.getValue());
    }
}
