package lv.homework.lesson8;

public class Car {

    private String manufactor, color;
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


    }

    public void isDriving(){
        System.out.println("Car is driving");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufactor='" + manufactor + '\'' +
                ", color='" + color + '\'' +
                ", wheelCount=" + wheelCount +
                '}';
    }
}




