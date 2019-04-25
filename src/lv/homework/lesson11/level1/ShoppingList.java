package lv.homework.lesson11.level1;

import java.math.BigDecimal;
import java.util.*;

public class ShoppingList {

    private List<Product> productList = new ArrayList<>();

    void addProduct (String productName, String category, BigDecimal price){
        productList.add(new Product(productName, category, price));
    }

    void deleteProduct (String productName, String category, BigDecimal price){
        System.out.println(productList.remove(productName));
    }

    void print(){
    for (Product listOfWords: productList){
        System.out.println(listOfWords);
    }}

}
