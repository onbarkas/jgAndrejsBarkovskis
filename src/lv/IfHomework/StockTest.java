package lv.IfHomework;

import java.sql.SQLOutput;

public class StockTest {
    public static void main(String[] args) {
        Stock IBM = new Stock("IBM", 150);
//        IBM.setCompany("IBM");
//        IBM.setCurrentValue(150.00);
        IBM.updatePrice(150.37);
        IBM.updatePrice(149.82);
        IBM.updatePrice(150.12);
        IBM.printInformation();
        System.out.println(IBM.getCompany());
    }
}
