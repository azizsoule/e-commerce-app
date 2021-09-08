package com.app.ecommerce.services;

import com.app.ecommerce.models.Inventory;
import com.app.ecommerce.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService extends BaseService<Inventory, Long> {

    @Autowired
    InventoryRepository repository;

    @Override
    public Inventory findById(Long aLong) {
        return repository.getById(aLong);
    }

    @Override
    public List<Inventory> findAll() {
        return repository.findAll();
    }

    @Override
    public Inventory save(Inventory inventory) {
        return repository.save(inventory);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }

    @Override
    public void delete(Inventory inventory) {
        repository.delete(inventory);
    }

}
