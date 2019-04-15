package lv.homework.lesson8;

class Truck extends Car {
    private int cargoSum;

    //lieka metode - nav izmantota
    public int getCargoSum() {
        return cargoSum;
    }

    public void setCargoSum(int cargoSum) {
        this.cargoSum = cargoSum;
    }

    public boolean ishaveCargo() {
        return cargoSum > 0;
    } //CamelCase

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return cargoSum == truck.cargoSum;
    }
//lieka rinda

    @Override
    public String toString() {
        return "Truck " + (ishaveCargo() ? "have a cargo " : "doesn't have a cargo ")
                + " Cargo sum is " + cargoSum +
                " manufacture='" + super.getManufactor() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", wheelCount=" + (super.getWheelCount() > 0 ? super.getWheelCount() : " Need a parametor"); ///Typo
    }
}
