package lv.Cikli;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("BMW");
        car.setColor("Melna");
        car.setMaxSpeed(200);
        car.setCurrentSpeed(100);
        car.speedUp();
        System.out.println(car.getCurrentSpeed());
    }
}
