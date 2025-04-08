package java_mid1.lang.object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        Object object = new Object();

//        Object[] objects = new Object[]{dog, car, object}; // 아래와 동일
        Object[] objects = {dog, car, object};

        size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는 " + objects.length);
    }
}
