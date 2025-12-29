package com.example.springprovider;

import com.example.springprovider.controller.ProductController;
import com.example.springprovider.entity.Product;
import com.example.springprovider.service.ProductService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@SpringBootTest
public abstract class ContractVerifierBase {

    @Autowired
    private ProductController productController;

    @MockitoBean
    private ProductService productService;

    @BeforeEach
    public void setup() {
        // Configure RestAssured to use your controller
        RestAssuredMockMvc.standaloneSetup(productController);

        // Mock the service call defined in your YAML (ID: 101)
        Product mockProduct = new Product(101L, "Wireless Mouse", 25.99);

        Mockito.when(productService.getProductById(101L)).thenReturn(mockProduct);
    }
}