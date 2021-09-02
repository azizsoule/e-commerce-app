package com.app.ecommerce.services;

import com.app.ecommerce.models.Customer;
import com.app.ecommerce.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository repository;

    Customer findById(long idCustomer) {
        return repository.getById(idCustomer);
    }

    List<Customer> findAll() {
        return repository.findAll();
    }

    Customer save(Customer customer) {
        return repository.save(customer);
    }

    void delete(long idCustomer) {
        repository.deleteById(idCustomer);
    }

}
