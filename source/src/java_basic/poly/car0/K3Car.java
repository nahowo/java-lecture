package java_basic.poly.car0;

public class K3Car implements Car {

    @Override
    public void startEngine() {
        System.out.println("K2Car.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("K2Car.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("K2Car.offEngine");
    }
}
