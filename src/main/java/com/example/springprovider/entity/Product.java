package com.example.springprovider.entity;

public class Product {

    Long id;
    String productName;
    Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public Product() {

    }

    public Product(Long id, String name, Double price) {
        this.id = id;
        this.productName = name;
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
