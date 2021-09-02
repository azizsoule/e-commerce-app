package com.app.ecommerce.services;

import com.app.ecommerce.models.CustomerType;
import com.app.ecommerce.repositories.CustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService {

    @Autowired
    CustomerTypeRepository repository;

    CustomerType save(CustomerType customerType) {
        return repository.save(customerType);
    }

    void delete(long idCustomerType) {
        repository.deleteById(idCustomerType);
    }

    List<CustomerType> findAll() {
        return repository.findAll();
    }

    CustomerType findById(long idCustomerType) {
        return repository.getById(idCustomerType);
    }

}
