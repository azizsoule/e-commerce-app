package com.app.ecommerce.services;

import com.app.ecommerce.models.Catalog;
import com.app.ecommerce.repositories.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {

    @Autowired
    CatalogRepository repository;

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
