package lv.homework.lesson3;

//Ok
//lietojam "ctrl + alt + l"
public class CarTest {
    public static void main(String[] args) {
        Car NewCar = new Car();
        NewCar.setColor("White");
        NewCar.setManufacturer("Mazda");
        NewCar.setYear(2020);

        System.out.println(NewCar.getManufacturer() + NewCar.getColor() + NewCar.getYear());
    }
}
