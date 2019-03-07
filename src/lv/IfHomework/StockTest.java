package lv.IfHomework;

import java.sql.SQLOutput;

public class StockTest {
    public static void main(String[] args) {
        Stock IBM = new Stock();
        IBM.setCompany("IBM");
        IBM.setCurrentValue(150.00);
        System.out.println(IBM.max + "jjajaja");
        IBM.updatePrice(200);
        System.out.println(IBM.max + "jjajaja");
        IBM.updatePrice(67);
        System.out.println(IBM.min + "jjajaja");
        IBM.updatePrice(32);
        System.out.println(IBM.min + "jjajaja");
        IBM.printInformation();
    }
}
