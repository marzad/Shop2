package de.neuefische.marzad.shop2.repository;

import de.neuefische.marzad.shop2.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private List<Product> products = new ArrayList<>();

    public ProductRepo() {
    }

    public ProductRepo(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


}
