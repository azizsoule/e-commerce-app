package com.app.ecommerce.services;

import com.app.ecommerce.models.Address;
import com.app.ecommerce.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdressService {

    @Autowired
    AddressRepository repository;

    Address findById(long idAddress) {
        return repository.getById(idAddress);
    }

    List<Address> findAll() {
        return repository.findAll();
    }

    Address save(Address address) {
        return repository.save(address);
    }

    void delete(long idAddress) {
        repository.deleteById(idAddress);
    }

}
