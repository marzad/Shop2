package de.neuefische.marzad.shop2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private int id;
    private List<Product> products;

/*    public Order(int id, List<Product> products) {
        this.products = products;
        this.id = id;
    }*/

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
