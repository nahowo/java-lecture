package java_mid1.lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("꼬맹이", 1);
        Dog dog2 = new Dog("둥이", 3);
        Object o = new Object();
        ObjectPrinter objectPrinter = new ObjectPrinter();

        Car car1 = new Car("캐스퍼");

//        System.out.println("toString 호출");
//        System.out.println(dog1.toString());
//        System.out.println(dog2.toString());
//        System.out.println(car1.toString());
        objectPrinter.print(dog1);
        objectPrinter.print(dog2);
        objectPrinter.print(car1);
        objectPrinter.print(o); // 오버라이딩되지 않은 toString() 호출
//
//        System.out.println("println 내부 호출");
//        System.out.println(dog1);
//        System.out.println(dog2);
//        System.out.println(car1);

        int i = System.identityHashCode(dog1); // 객체의 해시코드
        System.out.println(i);

        String refValue = Integer.toHexString(i); // 16진수 해시코드
        System.out.println(refValue);
    }
}
