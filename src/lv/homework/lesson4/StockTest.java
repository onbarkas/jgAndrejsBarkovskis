package lv.homework.lesson4;

public class StockTest {
    public static void main(String[] args) {
        Stock IBM = new Stock("IBM", 150);
        IBM.updatePrice(150.37);
        IBM.updatePrice(149.82);
        IBM.updatePrice(150.12);
        IBM.updatePrice(150.56);
        IBM.updatePrice(150.05);
        IBM.updatePrice(150.12);
        IBM.printInformation();
    }
}
