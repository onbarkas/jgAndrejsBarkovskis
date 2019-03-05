package lv.IfHomework;

import java.sql.SQLOutput;

public class StockTest {
    public static void main(String[] args) {
        Stock IBM = new Stock();
        IBM.setCompany("IBM");
        IBM.setCurrentValue(150.00);
        IBM.updatePrice();
        System.out.println(IBM.max + "jjajaja");
        IBM.setCurrentValue(180);
        IBM.updatePrice();
        System.out.println(IBM.max + "jjajaja");
        IBM.setCurrentValue(160);
        IBM.updatePrice();
        System.out.println(IBM.max + "jjajaja");
    }
}
