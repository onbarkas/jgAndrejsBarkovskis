package lv.homework.lesson8;

public class CarTest {
    public static void main(String[] args) {
        Bus bus = new Bus();
        RegularCar regularCar = new RegularCar();
        Truck truck = new Truck();




        bus.isDriving();
        regularCar.isDriving();
        truck.isDriving();
        System.out.println(bus);
    }
}
