package com.groceryapp.grocery_system.Repository;



import com.groceryapp.grocery_system.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

