package com.app.ecommerce.services;

import com.app.ecommerce.dtos.CustomerDTO;
import com.app.ecommerce.models.Customer;
import com.app.ecommerce.repositories.CustomerRepository;
import com.app.ecommerce.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userDetailsService")
public class CustomerService extends BaseService<CustomerDTO, Long> implements UserDetailsService {

    @Autowired
    private CustomerRepository repository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(Constants.ENCODER_LENGTH);

    @Override
    public CustomerDTO findById(Long aLong) {
        Customer customer = repository.getById(aLong);
        return modelMapper().map(customer, CustomerDTO.class);
    }

    @Override
    public List<CustomerDTO> findAll() {
        List<Customer> customers = repository.findAll();
        List<CustomerDTO> customerDTOS = new ArrayList<>();
        customers.forEach(customer -> {
            customerDTOS.add(modelMapper().map(customer, CustomerDTO.class));
        });
        return customerDTOS;
    }

    @Override
    public CustomerDTO save(CustomerDTO customerDTO) {
        if (customerDTO.getPassword() != null) {
            customerDTO.setPassword(passwordEncoder.encode(customerDTO.getPassword()));
        }
        System.out.println(customerDTO.getPassword());
        Customer customer = repository.save(modelMapper().map(customerDTO, Customer.class));
        return modelMapper().map(customer, CustomerDTO.class);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }

    @Override
    public void delete(CustomerDTO customerDTO) {
        repository.delete(modelMapper().map(customerDTO, Customer.class));
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        try {
            final Customer customer = repository.findByEmail(s);
            if (customer == null) {
                throw new UsernameNotFoundException("E-mail ou mot de passe incorrect !");
            }
            return customer;
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }

}
