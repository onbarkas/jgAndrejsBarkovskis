package lv.homework.lesson8;

import java.util.Objects;

public class Car {

    private String manufactor, color; //Typo: manufacture
    private int wheelCount;

    public String getManufactor() {
        return manufactor;
    }

    public String getColor() {
        return color;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getWheelCount() {
        return wheelCount;
//liekas rindas
//liekas rindas
    }

    public void isDriving(){
        System.out.println("Car is driving");
    }
//lieka rindas

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return wheelCount == car.wheelCount &&
                manufactor.equals(car.manufactor) &&
                color.equals(car.color);
    }
//lieka rindas

    @Override
    public String toString() {
        return "Car{" +
                "manufactor='" + manufactor + '\'' +
                ", color='" + color + '\'' +
                ", wheelCount=" + wheelCount +
                '}';
    }
}




