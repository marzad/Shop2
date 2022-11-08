package de.neuefische.marzad.shop2.model;

public class Product {
    private String brand;
    private String model;
    private int id;

    public Product() {
    }

    public Product(String brand, String model, int id) {
        this.brand = brand;
        this.model = model;
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", id=" + id +
                '}';
    }
}
