package de.neuefische.marzad.shop2.model;

import java.util.List;

public class Order {
    private List<Product> products;
    private int id;

    public Order() {
    }

    public Order(List<Product> products, int id) {
        this.products = products;
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", id=" + id +
                '}';
    }
}
