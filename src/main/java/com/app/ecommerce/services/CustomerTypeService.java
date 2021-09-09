package com.app.ecommerce.services;

import com.app.ecommerce.models.CustomerType;
import com.app.ecommerce.repositories.CustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService extends BaseService<CustomerType, Long> {

    @Autowired
    CustomerTypeRepository repository;

    @Override
    public CustomerType findById(Long aLong) {
        return repository.getById(aLong);
    }

    @Override
    public List<CustomerType> findAll() {
        return repository.findAll();
    }

    @Override
    public CustomerType save(CustomerType customerType) {
        return repository.save(customerType);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }

    @Override
    public void delete(CustomerType customerType) {
        repository.delete(customerType);
    }

}
