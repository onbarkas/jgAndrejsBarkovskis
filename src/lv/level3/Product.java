package lv.level3;

public class Product {
    private String name;
    private double regularPrice, discount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double calculateActualPrice(){
        double calculatedPrice = regularPrice - regularPrice * discount / 100;
        return calculatedPrice;
    }

    public void printInformation (){
        System.out.println("Product : name = " + getName() + ", regular price = "
                + getRegularPrice() + " EUR, discount = " + getDiscount()
                + "%, actual price = " + calculateActualPrice() + " EUR");
    }
}
