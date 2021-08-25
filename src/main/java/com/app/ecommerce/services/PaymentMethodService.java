package com.app.ecommerce.services;

import com.app.ecommerce.dtos.PaymentMethodDTO;
import com.app.ecommerce.models.PaymentMethod;
import com.app.ecommerce.repositories.PaymentMethodRepository;
import com.app.ecommerce.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentMethodService {

    @Autowired
    PaymentMethodRepository repository;

    @Autowired
    ModelMapper<PaymentMethodDTO, PaymentMethod> mapper;

    PaymentMethod findById(long idPaymentMethod) {
        return repository.getById(idPaymentMethod);
    }

    List<PaymentMethod> findAll() {
        return repository.findAll();
    }

    PaymentMethod save(PaymentMethod paymentMethod) {
        return repository.save(paymentMethod);
    }

    void delete(long idPaymentMethod) {
        repository.deleteById(idPaymentMethod);
    }

}
