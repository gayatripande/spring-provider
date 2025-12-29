package com.example.springprovider.service;

import com.example.springprovider.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public Product getProductById(Long id) {
        return new Product(1L, "Product 1", 10.99);
    }
}
