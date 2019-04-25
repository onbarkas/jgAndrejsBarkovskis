package lv.homework.lesson11.level1;

import java.math.BigDecimal;

public class test {
    public static void main(String[] args) {
        ShoppingList shoppinglist = new ShoppingList();
        shoppinglist.addProduct("jhhgs", "ajgfyt", BigDecimal.valueOf(67.959));
        shoppinglist.addProduct("jhhg", "ajgfyt", BigDecimal.valueOf(67.950));
        shoppinglist.addProduct("jhhgd", "ajgfyt", BigDecimal.valueOf(67.950));
        shoppinglist.deleteProduct("jhhg", "ajgfyt", BigDecimal.valueOf(67.950));
        shoppinglist.print();
    }
}
