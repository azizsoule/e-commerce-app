package com.app.ecommerce.services;

import com.app.ecommerce.models.Customer;
import com.app.ecommerce.repositories.CustomerRepository;
import com.app.ecommerce.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userDetailsService")
public class CustomerService extends BaseService<Customer, Long> implements UserDetailsService {

    @Autowired
    private CustomerRepository repository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(Constants.ENCODER_LENGTH);

    @Override
    public Customer findById(Long aLong) {
        return repository.getById(aLong);
    }

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public Customer save(Customer customer) {
        return repository.save(customer);
    }

    public Customer register(Customer customer) {
        if (repository.findByEmail(customer.getEmail()) == null) {
            return this.save(customer);
        } else {
            return null;
        }
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }

    @Override
    public void delete(Customer customer) {
        repository.delete(customer);
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
