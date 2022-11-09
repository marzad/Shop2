package de.neuefische.marzad.shop2.sevice;

import de.neuefische.marzad.shop2.model.Order;
import de.neuefische.marzad.shop2.model.Product;
import de.neuefische.marzad.shop2.repository.OrderRepo;
import de.neuefische.marzad.shop2.repository.ProductRepo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ShopServiceTest {

    ProductRepo productRepo =  mock(ProductRepo.class);
    OrderRepo orderRepo = mock(OrderRepo.class);
    ShopService shopService = new ShopService(productRepo, orderRepo);

    @Test
    void getProductsList() {
        List<Product> expected = new ArrayList<>();
        when(productRepo.getProducts()).thenReturn(expected);
        List<Product> result = shopService.getProductsList();

        assertEquals(expected, result);
    }

    @Test
    void getProductByName() {
        String name = "";
        Product expectedProduct = new Product(1,name);

        when(productRepo.getProductByName(name)).thenReturn(expectedProduct);

        Product result = shopService.getProductByName(name);

        assertEquals(expectedProduct,result);

    }

    @Test
    void getProductByID() {
        int id = 1;
        Product expectedProduct = new Product(1,"");

        when(productRepo.getProductByID(1)).thenReturn(expectedProduct);

        Product result = shopService.getProductByID(id);

        assertEquals(expectedProduct,result);
    }

    @Test
    void getOrdersList() {
    }

    @Test
    void getOrder() {
        Order expectedOrder = new Order();
        int id = 1;

        when(orderRepo.getOrder(id)).thenReturn(expectedOrder);
        Order result = new Order();

        assertEquals(result,expectedOrder);

    }

    @Test
    void addProductsListTest(){
        List<String> names = new ArrayList<>();
        List<Product> expected = productRepo.setProducts(names);

        when(productRepo.setProducts(names)).thenReturn(expected);
        List<Product> result = new ArrayList<>();

        assertEquals(result,expected);
    }
}