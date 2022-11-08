package de.neuefische.marzad.shop2.sevice;

import de.neuefische.marzad.shop2.model.Order;
import de.neuefische.marzad.shop2.model.Product;
import de.neuefische.marzad.shop2.repository.OrderRepo;
import de.neuefische.marzad.shop2.repository.ProductRepo;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ShopServiceTest {

    ProductRepo productRepo =  mock(ProductRepo.class);
    OrderRepo orderRepo = mock(OrderRepo.class);

    @Test
    void getProductsList() {
        ProductRepo expected = new ProductRepo();
        when(productRepo.getProducts()).thenReturn((List<Product>) expected);
    }

    @Test
    void getProductByName() {
    }

    @Test
    void getProductByID() {
    }

    @Test
    void getOrdersList() {
        Order expectedOrder = new Order();
    }

    @Test
    void getOrder() {
        Order expectedOrder = new Order();
    }
}