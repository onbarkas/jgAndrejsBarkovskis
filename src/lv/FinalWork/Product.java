package lv.FinalWork;

import lv.FinalWork.Model.ProductCategory;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
    private String name, discription;
    private Long id;
    private BigDecimal price, discount;
    private ProductCategory category;

    public Product(String name, String discription, Long id, BigDecimal price, BigDecimal discount, ProductCategory category) {
        this.name = name;
        this.discription = discription;
        this.id = id;
        this.price = price;
        this.discount = discount;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name) &&
                discription.equals(product.discription) &&
                id.equals(product.id) &&
                price.equals(product.price) &&
                discount.equals(product.discount) &&
                category == product.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, discription, id, price, discount, category);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", discription='" + discription + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", discount=" + discount +
                ", category=" + category +
                '}';
    }
}
