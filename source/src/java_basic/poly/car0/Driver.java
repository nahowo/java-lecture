package java_basic.poly.car0;

public class Driver {
    // Driver는 역할에만 의존
    private Car car; // 차의 종류에 의존하지 않음

    public void setCar(Car car) {
        System.out.println(car.getClass() + " 자동차 세팅");
        this.car = car;
    }

    public void drive() {
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
