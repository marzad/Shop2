package de.neuefische.marzad.shop2.controller;

import de.neuefische.marzad.shop2.model.Order;
import de.neuefische.marzad.shop2.model.Product;
import de.neuefische.marzad.shop2.repository.OrderRepo;
import de.neuefische.marzad.shop2.sevice.ShopService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("shop")
public class ShopController {
    private ShopService shop;

    public ShopController(ShopService shop) {
        this.shop = shop;
    }

    @GetMapping("api/products")
    public List<Product> getProducts(){
        return shop.getProductsList();
    }

    @GetMapping("api/products/{id}")
    public Product getProductByID(@PathVariable int id){
        Optional<Product> product = Optional.of(shop.getProductByID(id));
        return product.orElseGet(()-> null);
    }

    @GetMapping("api/orders")
    public OrderRepo getOrdersList(){
        return shop.getOrdersList();
    }

    @GetMapping("api/orders/{id}")
    public Order getOrderByID(@RequestParam int id){
        Optional<Order> order = Optional.of(shop.getOrder(id));
        return order.orElseGet(()-> null);
    }

    @PostMapping("api/orders")
    public void addOrders(@RequestBody int[] ids){
        List<Product> products = new ArrayList<>();
        for(int id: ids){
           products.add(shop.getProductByID(id));
        }
        shop.addOrder(products);

    }

    @PostMapping("api/products")
    public void addProduct(@RequestBody String name){
        shop.addProduct(name);
    }
}
