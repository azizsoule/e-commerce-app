package com.app.ecommerce.services;

import com.app.ecommerce.dtos.CartItemDTO;
import com.app.ecommerce.models.CartItem;
import com.app.ecommerce.repositories.CartItemRepository;
import com.app.ecommerce.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemService {

    @Autowired
    CartItemRepository repository;

    @Autowired
    ModelMapper<CartItemDTO, CartItem> mapper;

    CartItem findById(long idCartItem) {
        return repository.getById(idCartItem);
    }

    List<CartItem> findAll() {
        return repository.findAll();
    }

    CartItem save(CartItem cartItem) {
        return repository.save(cartItem);
    }

    void delete(long idCartItem) {
        repository.deleteById(idCartItem);
    }

}
