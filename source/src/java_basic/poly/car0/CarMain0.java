package java_basic.poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        K3Car k2Car = new K3Car();
        driver.setCar(k2Car);
        driver.drive();

        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
