package java_mid1.nested.inner.ex2;

public class Car {
    private int chargeLevel;
    private String model;

    private Engine engine;
    // Engine에서만 사용하는 메서드


    public Car(int chargeLevel, String model) {
        this.chargeLevel = chargeLevel;
        this.model = model;
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    public class Engine {
        public void start() {
            System.out.println("충전 레벨 확인: " + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다. ");
        }
    }
}
