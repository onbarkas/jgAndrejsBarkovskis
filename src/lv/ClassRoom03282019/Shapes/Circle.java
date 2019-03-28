package lv.ClassRoom03282019.Shapes;

class Circle extends Shape implements Roundable {

    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double radius() {
        return radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double perimeter() {
        return 2*Math.PI*radius;
    }
}
