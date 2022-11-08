package de.neuefische.marzad.shop2.repository;

import de.neuefische.marzad.shop2.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductRepo {
    private List<Product> products = new ArrayList<>();

    private int id = 0;

    public ProductRepo() {
    }

    public ProductRepo(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<String> list) {
        for(String str:list){
            this.id ++;
            products.add(new Product(this.id, str));
        }
    }

    public boolean addProduct(String name){
        this.id ++;
        return products.add(new Product(this.id,name));
    }

    public Product getProductByName(String name){
        for(Product p: products){
            if(p.name().equals(name)){
                return p;
            }
        }
        return null;
    }

    public Product getProductByID(int id){
        for(Product p: products){
            if(p.id() == id){
                return p;
            }
        }
        return null;
    }


}
