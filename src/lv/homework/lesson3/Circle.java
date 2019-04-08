package lv.homework.lesson3;

//Ok
public class Circle {
    double radius;

    public double getRadious(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    double calculateArea(){
        return 3.14*radius*radius;
    }

}
