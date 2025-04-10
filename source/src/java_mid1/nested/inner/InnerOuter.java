package java_mid1.nested.inner;

public class InnerOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner {
        private int innerInstanceValue = 1;

        public void print() {
            System.out.println(outClassValue);
            System.out.println(outInstanceValue);
            System.out.println(innerInstanceValue);
        }
    }
}
