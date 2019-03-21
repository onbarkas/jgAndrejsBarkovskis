package lv.homework.lesson6;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("BMW");
        car.setColor("Melna");
        car.setMaxSpeed(200);
        car.setCurrentSpeed(100);
        car.speedUp();
        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getCurrentSpeed());
        if (car.isDriving()) {
            System.out.println("Mashina brauc");
        } else{
            System.out.println("Masina nebrauc");
        }
        car.slowDown();
        System.out.println("Jauns atrums ir " + car.getCurrentSpeed());

        if (car.canAccelerate()) {
            System.out.println("Mashina var braukt par " + (car.getMaxSpeed()-car.getCurrentSpeed() + " atrak"));
        } else{
            System.out.println("Masina nevar braukt atrak");
        }
    }
}
