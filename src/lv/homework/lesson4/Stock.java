package lv.homework.lesson4;

public class Stock {
    private String company;
    private double currentValue;
    private double min;
    private double max;

    public Stock(String company, double currentValue) {
        setCompany(company);
        setCurrentValue(currentValue);
        setMin(currentValue);
        setMax(currentValue);
    }

    private String getCompany() {
        return company;
    }

    private void setCompany(String company) {
        this.company = company;
    }

    private double getCurrentValue() {
        return currentValue;
    }

    private void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;

    }

    private double getMax() {
        return max;
    }

    private void setMax(double max) {
        this.max = max;
    }

    private double getMin() {
        return min;
    }

    private void setMin(double min) {
        this.min = min;
    }

    public void updatePrice(double updateCurrentValue) {
        setCurrentValue(updateCurrentValue);
        if (updateCurrentValue > getMax()) {
            setMax(updateCurrentValue);
        }
        if (updateCurrentValue < getMin()) {
            setMin(updateCurrentValue);
        }
    }

    public void printInformation() {
        System.out.println("Current value = " + getCurrentValue());
        System.out.println("Max = " + getMax());
        System.out.println("Min = " + getMin());
    }
}
