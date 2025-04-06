package java_basic.access.b;

//import java_basic.access.a.DefaultClass1;
//import java_basic.access.a.DefaultClass2;
import java_basic.access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        // default 제어자는 다른 패키지에서 접근 불가능
//        DefaultClass1 defaultClass1 = new DefaultClass1();
//        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
