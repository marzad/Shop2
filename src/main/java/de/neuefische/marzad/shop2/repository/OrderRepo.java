package de.neuefische.marzad.shop2.repository;

import de.neuefische.marzad.shop2.model.Order;
import de.neuefische.marzad.shop2.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepo {

    private int id = 0;
    public OrderRepo() {
    }

    private List<Order> orders = new ArrayList<>();

    public OrderRepo(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrdersList() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public boolean addOrder(List<Product> products){
        this.id ++;
        return orders.add(new Order(this.id,products));
    }

    public Order getOrder(int id){
        for(Order o: orders){
            if(o.getId() == id){
                return o;
            }
        }
        return null;
    }
}
