package java_mid1.nested.inner.ex1;

public class Engine {
    private Car car;

    // Car에서만 사용하는 생성자
    public Engine(Car car) {
        this.car = car;
    }

    public void start() {
        System.out.println("충전 레벨 확인: " + car.getChargeLevel());
        System.out.println(car.getModel() + "의 엔진을 구동합니다. ");
    }
}
