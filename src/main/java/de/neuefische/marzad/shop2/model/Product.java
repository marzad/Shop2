package de.neuefische.marzad.shop2.model;

public class Product {
//    private String brand;
//    private String model;
    private int id;
    private String name;

    public Product() {
    }

/*    public Product(String brand, String model, int id) {
        this.brand = brand;
        this.model = model;
        this.name;
        this.id = id;
    }*/

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

/*    public String getBrand() {
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
    }*/

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

/*    @Override
    public String toString() {
        return "Product{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", id=" + id +
                '}';
    }*/

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
