package java_mid1.lang.object.tostring;

public class Car {
    private String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    public void move() {
        System.out.println("위이잉...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                '}';
    }
}
