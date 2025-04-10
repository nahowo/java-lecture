package java_mid1.nested.test;

public class OuterClass3 {
    public void myMethod() {
        class LocalClass {
            public void hello() {
                System.out.println("hello from local!");
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.hello();
    }
}
