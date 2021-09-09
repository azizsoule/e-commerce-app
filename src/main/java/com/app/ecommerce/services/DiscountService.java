package com.app.ecommerce.services;

import com.app.ecommerce.models.Discount;
import com.app.ecommerce.repositories.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountService extends BaseService<Discount, Long> {

    @Autowired
    DiscountRepository repository;

    @Override
    public Discount findById(Long aLong) {
        return repository.getById(aLong);
    }

    @Override
    public List<Discount> findAll() {
        return repository.findAll();
    }

    @Override
    public Discount save(Discount discount) {
        return repository.save(discount);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }

    @Override
    public void delete(Discount discount) {
        repository.delete(discount);
    }

}
