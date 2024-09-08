package com.simpleapi.simpleapi.service;

import org.springframework.stereotype.Service;

@Service
public class MartService {

    public String getProductById(String productId) {
        // Mock data (simulating product details)
        if (productId.equals("101")) {
            return "Product ID: 101, Name: Laptop, Price: $1200";
        } else if (productId.equals("102")) {
            return "Product ID: 102, Name: Smartphone, Price: $800";
        } else {
            return "Product not found";
        }
    }
}
