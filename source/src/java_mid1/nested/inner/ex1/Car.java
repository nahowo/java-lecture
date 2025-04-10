package java_mid1.nested.inner.ex1;

public class Car {
    private int chargeLevel;
    private String model;
    private Engine engine;

    // Engine에서만 사용하는 메서드
    public int getChargeLevel() {
        return chargeLevel;
    }

    // Engine에서만 사용하는 메서드
    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Car(int chargeLevel, String model) {
        this.chargeLevel = chargeLevel;
        this.model = model;
        this.engine = new Engine(this);
    }

    public void start() {
        engine.start();
        System.out.println("엔진 시작 완료");
    }
}
