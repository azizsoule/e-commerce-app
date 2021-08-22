package com.app.ecommerce.services;

import com.app.ecommerce.dtos.AddressDTO;
import com.app.ecommerce.models.Address;
import com.app.ecommerce.repositories.AddressRepository;
import com.app.ecommerce.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdressService {

    @Autowired
    AddressRepository repository;

    ModelMapper<AddressDTO, Address> mapper;

    Address findById(long idAddress) {
        return repository.getById(idAddress);
    }

    List<Address> findAll() {
        return repository.findAll();
    }

    Address save(Address address) {
        return repository.save(address);
    }

    public void update(AddressDTO dto) {
        Address address = this.findById(dto.getIdAddress());
        mapper.updateModelFromDTO(dto, address);
        repository.save(address);
    }

    void delete(long idAddress) {
        repository.deleteById(idAddress);
    }

}
