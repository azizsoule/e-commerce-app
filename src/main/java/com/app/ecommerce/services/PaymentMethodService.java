package com.app.ecommerce.services;

import com.app.ecommerce.models.PaymentMethod;
import com.app.ecommerce.repositories.PaymentMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentMethodService extends BaseService<PaymentMethod, Long> {

    @Autowired
    PaymentMethodRepository repository;

    @Override
    public PaymentMethod findById(Long aLong) {
        return repository.getById(aLong);
    }

    @Override
    public List<PaymentMethod> findAll() {
        return repository.findAll();
    }

    @Override
    public PaymentMethod save(PaymentMethod paymentMethod) {
        return repository.save(paymentMethod);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }

    @Override
    public void delete(PaymentMethod paymentMethod) {
        repository.delete(paymentMethod);
    }

}
