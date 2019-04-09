package lv.homework.lesson8;

public class CarTest {
    public static void main(String[] args) {
        Bus bus = new Bus();
        RegularCar regularCar = new RegularCar();
        Truck truck = new Truck();

        Car car = new Car();

        car.setManufactor("IBM");
        car.setColor("red");
        car.setWheelCount(5);
        System.out.println(car);

        bus.setManufactor("Volvo");

        bus.isDriving();
        regularCar.isDriving();
        truck.isDriving();
        System.out.println(bus);
        System.out.println(truck);
        truck.setCargoSum(2);
        truck.setManufactor("Scanija");
        truck.setColor("white");
        System.out.println(truck);
    }
}
