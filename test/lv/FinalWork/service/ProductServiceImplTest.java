/*
package lv.FinalWork.service;


import lv.FinalWork.Model.Product;
import lv.FinalWork.service.ProductService;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

import java.util.List;

import static org.junit.Assert.*;

public class ProductServiceImplTest {

    private ProductServiceImpl service;

    @Before
    public void setUp() {
        service = new ProductServiceImpl();
    }

    @Test
    public void shouldSaveAndFindProductById() {
        Product myProduct = new Product();
        Long productId = service.add(myProduct);
        assertEquals(myProduct, service.findBy(productId));
    }

    @Test
    public void shouldFindAllProducts() {
        Product myProduct = new Product();
        service.add(myProduct);
        List<Product> allProducts = service.findAll();
        assertNotNull(allProducts);
        assertEquals(1, allProducts.size());
        assertEquals(myProduct, allProducts.get(0));
    }

    @Test
    public void shouldDeleteById() {
        Product myProduct = new Product();
        Long productId = service.add(myProduct);

        assertFalse(service.findAll().isEmpty());
        service.deleteBy(productId);
        assertTrue(service.findAll().isEmpty());
    }
}*/
