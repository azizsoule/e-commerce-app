package com.app.ecommerce.services;

import com.app.ecommerce.dtos.CatalogDTO;
import com.app.ecommerce.models.Catalog;
import com.app.ecommerce.repositories.CatalogRepository;
import com.app.ecommerce.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {

    @Autowired
    CatalogRepository repository;

    @Autowired
    ModelMapper<CatalogDTO, Catalog> mapper;

    Catalog findById(long idCatalog) {
        return repository.getById(idCatalog);
    }

    List<Catalog> findAll() {
        return repository.findAll();
    }

    Catalog save(Catalog catalog) {
        return repository.save(catalog);
    }

    void delete(long idCatalog) {
        repository.deleteById(idCatalog);
    }

}
