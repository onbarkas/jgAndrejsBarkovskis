package lv.IfHomework;

public class Stock {
    private String company;
    private double currentValue;
    private double min;
    private double max;

    public Stock(String company, double currentValue) {
        setCompany(company);
        setCurrentValue(currentValue);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
        setMin(currentValue);
        setMax(currentValue);
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public void updatePrice(double updateCurrentValue) {
        if (updateCurrentValue > getMax()) {
            setMax(updateCurrentValue);
        }
        if (updateCurrentValue < getMin()) {
            setMin(updateCurrentValue);
        }
        currentValue = updateCurrentValue;
    }


    public void printInformation() {
        System.out.println("Current value = " + getCurrentValue());
        System.out.println("Max = " + getMax());
        System.out.println("Min = " + getMin());
    }
}
