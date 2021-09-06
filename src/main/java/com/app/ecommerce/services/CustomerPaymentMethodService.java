package com.app.ecommerce.services;

import com.app.ecommerce.dtos.CustomerPaymentMethodDTO;
import com.app.ecommerce.models.CustomerPaymentMethod;
import com.app.ecommerce.repositories.CustomerPaymentMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerPaymentMethodService extends BaseService<CustomerPaymentMethodDTO, Long> {

    @Autowired
    CustomerPaymentMethodRepository repository;

    @Override
    public CustomerPaymentMethodDTO findById(Long aLong) {
        CustomerPaymentMethod customerPaymentMethod = repository.getById(aLong);
        return modelMapper().map(customerPaymentMethod, CustomerPaymentMethodDTO.class);
    }

    @Override
    public List<CustomerPaymentMethodDTO> findAll() {
        List<CustomerPaymentMethodDTO> userPaymentMethodDTOS = new ArrayList<>();
        List<CustomerPaymentMethod> customerPaymentMethods = repository.findAll();
        customerPaymentMethods.forEach(customerPaymentMethod -> {
            userPaymentMethodDTOS.add(modelMapper().map(customerPaymentMethod, CustomerPaymentMethodDTO.class));
        });
        return userPaymentMethodDTOS;
    }

    @Override
    public CustomerPaymentMethodDTO save(CustomerPaymentMethodDTO userPaymentMethodDTO) {
        CustomerPaymentMethod customerPaymentMethod = repository.save(modelMapper().map(userPaymentMethodDTO, CustomerPaymentMethod.class));
        return modelMapper().map(customerPaymentMethod, CustomerPaymentMethodDTO.class);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }

    @Override
    public void delete(CustomerPaymentMethodDTO customerPaymentMethodDTO) {
        repository.delete(modelMapper().map(customerPaymentMethodDTO, CustomerPaymentMethod.class));
    }

}
