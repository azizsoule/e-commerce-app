package com.app.ecommerce.services;

import com.app.ecommerce.dtos.RegionDTO;
import com.app.ecommerce.models.Region;
import com.app.ecommerce.repositories.RegionRepository;
import com.app.ecommerce.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {

    @Autowired
    RegionRepository repository;

    @Autowired
    ModelMapper<RegionDTO, Region> mapper;

    Region findById(long idRegion) {
        return repository.getById(idRegion);
    }

    List<Region> findAll() {
        return repository.findAll();
    }

    Region save(Region region) {
        return repository.save(region);
    }

    void delete(long idRegion) {
        repository.deleteById(idRegion);
    }

}
