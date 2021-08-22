package com.app.ecommerce.services;

import com.app.ecommerce.models.OrderItem;
import com.app.ecommerce.repositories.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemService {

    @Autowired
    OrderItemRepository repository;

    OrderItem findById(long idOrderItem) {
        return repository.getById(idOrderItem);
    }

    List<OrderItem> findAll() {
        return repository.findAll();
    }

    OrderItem save(OrderItem orderItem) {
        return repository.save(orderItem);
    }

    void delete(long idOrderItem) {
        repository.deleteById(idOrderItem);
    }

}
