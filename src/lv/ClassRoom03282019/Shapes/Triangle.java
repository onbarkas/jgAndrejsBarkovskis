package lv.ClassRoom03282019.Shapes;

class Triangle extends Shape implements Edgable {
    private final double sideA;
    private final double sideB;
    private final double sideC;
    private final double halfP;

    Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        halfP = perimeter() / 2;
    }


    @Override
    public int edgeCount() {
        return 3;
    }

    @Override
    double area() {
        return Math.sqrt(halfP * (halfP - sideA) * (halfP - sideB) * (halfP - sideC));
    }

    @Override
    double perimeter() {
        return sideA + sideB + sideC;
    }
}
