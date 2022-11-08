package de.neuefische.marzad.shop2.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
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

    public boolean addProduct(Product product){
        return products.add(product);
    }

    public Product getProductByName(String name){
        for(Product p: products){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

    public Product getProductByID(int id){
        for(Product p: products){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }


}
