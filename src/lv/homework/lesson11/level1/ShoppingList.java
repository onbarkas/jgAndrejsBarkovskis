package lv.homework.lesson11.level1;

import java.math.BigDecimal;
import java.util.*;

class ShoppingList {

    private List<Product> productList = new ArrayList<>();

    void addProduct(String productName, String category, BigDecimal price) {
        productList.add(new Product(productName, category, price));
    }

    void deleteProduct(String productName) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductName().equals(productName)) {
                productList.remove(i);
            }
        }
    }


    void print() {
        for (Product listOfWords : productList) {
            System.out.println(listOfWords);
        }
    }

}
