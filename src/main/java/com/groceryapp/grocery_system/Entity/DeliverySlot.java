package com.groceryapp.grocery_system.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
public class DeliverySlot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean available;
}

