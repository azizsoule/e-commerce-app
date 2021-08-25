package com.app.ecommerce.services;

import com.app.ecommerce.dtos.OrderDetailDTO;
import com.app.ecommerce.models.Order;
import com.app.ecommerce.repositories.OrderRepository;
import com.app.ecommerce.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository repository;

    @Autowired
    ModelMapper<OrderDetailDTO, Order> mapper;

    Order findById(long idOrder) {
        return repository.getById(idOrder);
    }

    List<Order> findAll() {
        return repository.findAll();
    }

    Order save(Order order) {
        return repository.save(order);
    }

    void delete(long idOrder) {
        repository.deleteById(idOrder);
    }

}
