package lv.homework.lesson11.level1;

import java.math.BigDecimal;

public class test {
    public static void main(String[] args) {
        ShoppingList shoppinglist = new ShoppingList();
        System.out.println("Add product");
        shoppinglist.addProduct("Apple", ProductCategory.PC, BigDecimal.valueOf(899.99));
        shoppinglist.addProduct("Samsung", ProductCategory.LAPTOP, BigDecimal.valueOf(999.99));
        shoppinglist.addProduct("Huawei", ProductCategory.MOBILE, BigDecimal.valueOf(399.99));
        shoppinglist.print();
        System.out.println("delete product");
        shoppinglist.deleteProduct("Huawei");
        shoppinglist.print();
        System.out.println("Products in price range");
        shoppinglist.priceRange(BigDecimal.valueOf(800),BigDecimal.valueOf(999.98));
        System.out.println("Products in category range");
        shoppinglist.categoryList(ProductCategory.LAPTOP);
    }
}
