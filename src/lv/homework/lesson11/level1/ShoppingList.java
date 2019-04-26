package lv.homework.lesson11.level1;

import java.math.BigDecimal;
import java.util.*;

class ShoppingList {

    private List<Product> productList = new ArrayList<>();

    void addProduct(String productName, ProductCategory category, BigDecimal price) {
        productList.add(new Product(productName, category, price));
    }

    void deleteProduct(String productName) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductName().equals(productName)) {
                productList.remove(i);
            }
        }
    }

    void priceRange(BigDecimal priceBegin, BigDecimal priceEnd) {
        for (int i = 0; i < productList.size(); i++) {
            if ((productList.get(i).getPrice().compareTo(priceBegin)) >= 0
                    && (productList.get(i).getPrice().compareTo(priceEnd)) <= 0) {
                System.out.println(productList.get(i));
            }
        }
    }

    void categoryList (ProductCategory category){
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getCategory().equals(category)) {
                System.out.println(productList.get(i));
            }
        }
    }

    void print() {
        for (Product listOfWords : productList) {
            System.out.println(listOfWords);
        }
    }

}
