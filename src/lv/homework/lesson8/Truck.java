package lv.homework.lesson8;

class Truck extends Car {
    private int cargoSum;

    public int getCargoSum() {
        return cargoSum;
    }

    public void setCargoSum(int cargoSum) {
        this.cargoSum = cargoSum;
    }

    public boolean ishaveCargo() {
        return cargoSum > 0;
    }

    @Override
    public String toString() {
        return "Truck " + (ishaveCargo() ? "have a cargo " : "doesn't have a cargo ")
                + " Cargo sum is " + cargoSum +
                " manufactor='" + super.getManufactor() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", wheelCount=" + (super.getWheelCount()>0? super.getWheelCount():"Need a parametor");
    }
}
