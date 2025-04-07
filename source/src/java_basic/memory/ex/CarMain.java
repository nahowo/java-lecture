package java_basic.memory.ex;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        Car car3 = new Car("car3");

        System.out.println("전체 차 개수: " + Car.count);
    }
}
