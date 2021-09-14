package com.app.ecommerce.services;

import com.app.ecommerce.models.Address;
import com.app.ecommerce.models.Order;
import com.app.ecommerce.repositories.AddressRepository;
import io.debezium.data.Envelope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AddressService extends BaseService<Address, Long> {

    @Autowired
    AddressRepository repository;

    @Override
    public Address findById(Long aLong) {
        return repository.getById(aLong);
    }

    @Override
    public List<Address> findAll() {
        return repository.findAll();
    }

    @Override
    public Address save(Address address) {
        return repository.save(address);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }

    @Override
    public void delete(Address address) {
        repository.delete(address);
    }

    public void replicateData(Map<String, Object> data, Envelope.Operation operation) {
        final Address address = this.modelMapper().map(data, Address.class);
        if (Envelope.Operation.DELETE == operation) {
            deleteById(address.getIdAddress());
        } else {
            save(address);
        }
    }

}
