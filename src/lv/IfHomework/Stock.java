package lv.IfHomework;

public class Stock   {
    String company;
    double currentValue;
    double min;
    double max;


    public String getCompany(){
        return company;
    }

    public void setCompany (String company){this.company = company;}

    public double getCurrentValue(){
        return currentValue;
    }

    public void setCurrentValue(double currentValue){
        this.currentValue = currentValue;
        min = currentValue;
        max = currentValue;}

    public double getMax(){
        return max;
    }

    public void setMax(double max){this.max = max;}

    public double getMin(){
        return min;
    }

    public void setMin(double min){this.min = min;}

    public void updatePrice(double updateCurrentValue) {
        if (updateCurrentValue > max) {
            max = updateCurrentValue;
        }
        if (updateCurrentValue < min) {
            min = updateCurrentValue;
        }
        currentValue = updateCurrentValue;
    }

    public void printInformation(){
            System.out.println("Current value = " + currentValue);
            System.out.println("Max = " + max);
            System.out.println("Min = " + min);
    }
}
