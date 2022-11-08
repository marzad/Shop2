package de.neuefische.marzad.shop2.sevice;

import de.neuefische.marzad.shop2.model.Order;
import de.neuefische.marzad.shop2.model.Product;
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

    public ProductRepo getProductsList() {
        return products;
    }

    public boolean addProduct(Product product){
        return products.addProduct(product);
    }

    public Product getProductByName(String name){
        return products.getProductByName(name);
    }

    public OrderRepo getOrdersList() {
        return orders;
    }

    public boolean addOrder(Order order){
        return orders.addOrder(order);
    }

    public Order getOrder(int id){
        return orders.getOrder(id);
    }


}
