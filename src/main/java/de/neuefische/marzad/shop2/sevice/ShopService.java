package de.neuefische.marzad.shop2.sevice;

import de.neuefische.marzad.shop2.model.Order;
import de.neuefische.marzad.shop2.model.Product;
import de.neuefische.marzad.shop2.repository.OrderRepo;
import de.neuefische.marzad.shop2.repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {

    private ProductRepo products = new ProductRepo();
    private OrderRepo orders = new OrderRepo();

    public ShopService() {
    }

    public ShopService(ProductRepo products, OrderRepo orders){
        this.products = products;
        this.orders = orders;
    }

    public List<Product> getProductsList() {
        return products.getProducts();
    }

    public boolean addProduct(String name){
        return products.addProduct(name);
    }

    public Product getProductByName(String name){
        return products.getProductByName(name);
    }

    public Product getProductByID(int id){
        return products.getProductByID(id);
    }



    public OrderRepo getOrdersList() {
        return orders;
    }

    public boolean addOrder(List<Product> products){
        return orders.addOrder(products);
    }

    public Order getOrder(int id){
        return orders.getOrder(id);
    }


}