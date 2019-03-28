package lv.ClassRoom03282019.Shapes;

public class Square extends Shape implements Edgable {

    private final double sideLenght;

    public Square(double sideLenght) {
        this.sideLenght = sideLenght;
    }

    @Override
    public int edgeCount() {
        return 4;
    }

    @Override
    double area() {
        return Math.pow(sideLenght, 2);
    }

    @Override
    double perimeter() {
        return sideLenght * edgeCount();
    }
}
