package lv.homework.lesson8;

class Truck extends Car {
    int cargoSum;
    public boolean ishaveCargo() {
        return cargoSum > 0;
    }

    @Override
    public String toString() {
        return "Truck " + (ishaveCargo() ? "have a cargo ": "doesn't have a cargo " ) + super.toString();
    }
}
