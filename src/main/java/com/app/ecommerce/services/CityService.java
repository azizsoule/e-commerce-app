package com.app.ecommerce.services;

import com.app.ecommerce.dtos.CityDTO;
import com.app.ecommerce.models.City;
import com.app.ecommerce.repositories.CityRepository;
import com.app.ecommerce.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    CityRepository repository;

    @Autowired
    ModelMapper<CityDTO, City> mapper;

    City findById(long idCity) {
        return repository.getById(idCity);
    }

    List<City> findAll() {
        return repository.findAll();
    }

    City save(City city) {
        return repository.save(city);
    }

    void delete(long idCity) {
        repository.deleteById(idCity);
    }

}
