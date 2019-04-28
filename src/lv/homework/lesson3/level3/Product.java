package lv.homework.lesson3.level3;

import java.text.DecimalFormat;

//Ok
class Product {
    private String name;
    private double regularPrice, discount;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    private double getRegularPrice() {
        return regularPrice;
    }

    void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    private double getDiscount() {
        return discount;
    }

    void setDiscount(double discount) {
        this.discount = discount;
    }

    private double calculateActualPrice() {
        return regularPrice - regularPrice * discount / 100;
    }

    private static DecimalFormat newDecimalFormat = new DecimalFormat("#.##");

    void printInformation() {
        System.out.println("Product : name = " + getName() + ", regular price = "
                + newDecimalFormat.format(getRegularPrice()) + " EUR, discount = " + getDiscount()
                + "%, actual price = " + newDecimalFormat.format(calculateActualPrice()) + " EUR");
    }
}

/*    public double calculateActualPrice(){
        double calculatedPrice = regularPrice - regularPrice * discount / 100; //nav nepieciešams atsevišķs mainīgas var rakstīt uzreiz "return"
        return calculatedPrice;
    }*/
