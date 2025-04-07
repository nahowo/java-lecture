package java_basic.extends1.access.child;

import java_basic.extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        pubV = 1;
        proV = 2;
//        defV = 3; // 컴파일 오류
//        priV = 4; // 컴파일 오류

        pubM();
        proM();
//        defM();
//        priM();

        printParent();
    }
}
