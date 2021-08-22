package com.app.ecommerce.services;

import com.app.ecommerce.models.OrderState;
import com.app.ecommerce.repositories.OrderStateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderStateService {

    @Autowired
    OrderStateRepository repository;

    OrderState findById(String idOrderState) {
        return repository.getById(idOrderState);
    }

    List<OrderState> findAll() {
        return repository.findAll();
    }

    OrderState save(OrderState orderState) {
        return repository.save(orderState);
    }

    void delete(String idOrderState) {
        repository.deleteById(idOrderState);
    }

}
