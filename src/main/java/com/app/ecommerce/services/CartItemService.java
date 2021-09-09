package com.app.ecommerce.services;

import com.app.ecommerce.models.CartItem;
import com.app.ecommerce.repositories.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemService extends BaseService<CartItem, Long> {

    @Autowired
    CartItemRepository repository;

    @Override
    public CartItem findById(Long aLong) {
        return repository.getById(aLong);
    }

    @Override
    public List<CartItem> findAll() {
        return repository.findAll();
    }

    @Override
    public CartItem save(CartItem cartItem) {
        return repository.save(cartItem);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }

    @Override
    public void delete(CartItem cartItem) {
        repository.delete(cartItem);
    }

}
