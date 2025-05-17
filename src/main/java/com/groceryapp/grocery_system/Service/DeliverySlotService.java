package com.groceryapp.grocery_system.Service;

import com.groceryapp.grocery_system.Entity.DeliverySlot;
import com.groceryapp.grocery_system.Repository.DeliverySlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliverySlotService {
    @Autowired
    private DeliverySlotRepository deliverySlotRepository;

    public List<DeliverySlot> getAvailableSlots() {
        return deliverySlotRepository.findAll();
    }

    public DeliverySlot addSlot(DeliverySlot slot) {
        return deliverySlotRepository.save(slot);
    }
}

