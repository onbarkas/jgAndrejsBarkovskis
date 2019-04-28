package lv.homework.lesson4.level2;

class Stock {
    private String company;
    private double currentValue;
    private double min;
    private double max;

    Stock(String company, double currentValue) {
        setCompany(company);
        setCurrentValue(currentValue);
        setMin(currentValue);
        setMax(currentValue);
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

    private double getMin() {
        return min;
    }

    private void setMin(double min) {
        this.min = min;
    }

    private double getMax() {
        return max;
    }

    private void setMax(double max) {
        this.max = max;
    }

    void updatePrice(double updateCurrentValue) {
        setCurrentValue(updateCurrentValue);
        if (updateCurrentValue > getMax()) {
            setMax(updateCurrentValue);
        }
        if (updateCurrentValue < getMin()) {
            setMin(updateCurrentValue);
        }
    }

    void printInformation() {
        System.out.println("Company's name = " + company + "\nCurrent value = " + getCurrentValue()
                + "\nMax = " + getMax() + "\nMin = " + getMin() + "\n");
    }
}
