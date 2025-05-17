package com.groceryapp.grocery_system.Controller;

import com.groceryapp.grocery_system.Entity.Product;
import com.groceryapp.grocery_system.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> listProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @GetMapping("/recommend")
    public List<Product> recommend(@RequestParam String category) {
        return productService.recommendProducts(category);
    }

    @PutMapping("/stock/{id}")
    public Product updateStock(@PathVariable Long id, @RequestParam int quantity) {
        return productService.updateStock(id, quantity);
    }
}

