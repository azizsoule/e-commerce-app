package com.app.ecommerce.services;

import com.app.ecommerce.models.Inventory;
import com.app.ecommerce.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    InventoryRepository repository;

    Inventory findById(long idInventory) {
        return repository.getById(idInventory);
    }

    List<Inventory> findAll() {
        return repository.findAll();
    }

    Inventory save(Inventory inventory) {
        return repository.save(inventory);
    }

    void delete(long idInventory) {
        repository.deleteById(idInventory);
    }

}
