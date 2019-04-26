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

    String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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
