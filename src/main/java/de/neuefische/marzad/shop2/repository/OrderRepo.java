package de.neuefische.marzad.shop2.repository;

import de.neuefische.marzad.shop2.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepo {
    private List<Order> orders = new ArrayList<>();

    public OrderRepo(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
