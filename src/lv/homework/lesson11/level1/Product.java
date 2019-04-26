package lv.homework.lesson11.level1;

import java.math.BigDecimal;

public class Product {
    private String productName;
    private ProductCategory category;
    private BigDecimal price;

    Product(String productName, ProductCategory category, BigDecimal price) {
        this.productName = productName;
        this.category = category;
        this.price = price;
    }

    String getProductName() {
        return productName;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price.setScale(2, 5) +
                '}';
    }
}
