package com.groceryapp.grocery_system.Repository;

import com.groceryapp.grocery_system.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory(String category);
}

