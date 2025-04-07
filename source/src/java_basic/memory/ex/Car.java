package java_basic.memory.ex;

public class Car {
    private String name;
    public static int count;
    public Car(String name) {
        this.name = name;
        System.out.println("차량 구입: " + name);
        count ++;
    }
}
