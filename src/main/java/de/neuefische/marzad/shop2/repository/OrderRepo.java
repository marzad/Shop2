package de.neuefische.marzad.shop2.repository;

import de.neuefische.marzad.shop2.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepo {
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

    public boolean addOrder(Order order){
        return orders.add(order);
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
