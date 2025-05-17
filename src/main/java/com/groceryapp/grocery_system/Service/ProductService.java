package com.groceryapp.grocery_system.Service;


import com.groceryapp.grocery_system.Entity.Product;
import com.groceryapp.grocery_system.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> recommendProducts(String category) {
        return productRepository.findByCategory(category);
    }

    public Product updateStock(Long productId, int quantity) {
        Product product = productRepository.findById(productId).orElseThrow();
        product.setStock(product.getStock() - quantity);
        return productRepository.save(product);
    }
}

