package com.app.ecommerce.services;

import com.app.ecommerce.models.Discount;
import com.app.ecommerce.repositories.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountService {

    @Autowired
    DiscountRepository repository;

    Discount findById(long idDiscount) {
        return repository.getById(idDiscount);
    }

    List<Discount> findAll() {
        return repository.findAll();
    }

    Discount save(Discount discount) {
        return repository.save(discount);
    }

    void delete(long idDiscount) {
        repository.deleteById(idDiscount);
    }

}
