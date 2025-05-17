package com.groceryapp.grocery_system.Controller;


import com.groceryapp.grocery_system.Entity.DeliverySlot;
import com.groceryapp.grocery_system.Service.DeliverySlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/slots")
public class DeliverySlotController {
    @Autowired
    private DeliverySlotService deliverySlotService;

    @GetMapping
    public List<DeliverySlot> listSlots() {
        return deliverySlotService.getAvailableSlots();
    }

    @PostMapping
    public DeliverySlot addSlot(@RequestBody DeliverySlot slot) {
        return deliverySlotService.addSlot(slot);
    }
}

