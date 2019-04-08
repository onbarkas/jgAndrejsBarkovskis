package lv.homework.lesson3;

//Ok
public class ProductTest {
    public static void main(String[] args) {
        Product NewProduct = new Product();
        NewProduct.setName("Milk");
        NewProduct.setRegularPrice(0.80);
        NewProduct.setDiscount(20);
        NewProduct.printInformation();
    }
}
