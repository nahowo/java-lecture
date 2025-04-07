package java_basic.extends1.ex2;

public class CarMain1 {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        GasCar gasCar = new GasCar();
        HydrogenCar hydrogenCar = new HydrogenCar();

        electricCar.move();
//        electricCar.charge();
//        electricCar.openDoor();
        gasCar.move();
//        gasCar.fillUp();
//        gasCar.openDoor();
//        hydrogenCar.move();
//        hydrogenCar.fillHydrogen();
//        hydrogenCar.openDoor();
    }
}
