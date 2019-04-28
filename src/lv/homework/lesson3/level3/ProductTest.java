package lv.homework.lesson3.level3;

//Ok
public class ProductTest {
    public static void main(String[] args) {
        Product NewProduct = new Product();
        NewProduct.setName("Milk");
        NewProduct.setRegularPrice(0.8089);
        NewProduct.setDiscount(20);
        NewProduct.printInformation();
    }
}
