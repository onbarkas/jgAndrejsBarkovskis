package lv.homework.lesson11.level1;

import java.math.BigDecimal;

public class Product {
    private String productName, category;
    private BigDecimal price;

    Product(String productName, String category, BigDecimal price) {
        this.productName = productName;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
