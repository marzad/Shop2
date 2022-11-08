package de.neuefische.marzad.shop2.sevice;

import de.neuefische.marzad.shop2.model.Order;
import de.neuefische.marzad.shop2.repository.OrderRepo;
import de.neuefische.marzad.shop2.repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShopService {

    private ProductRepo products = new ProductRepo();
    private OrderRepo orders = new OrderRepo();

    public ShopService() {
    }

    public ProductRepo getProducts() {
        return products;
    }

    public OrderRepo getOrders() {
        return orders;
    }

    public Order addOrder(Order order){

    }
}
