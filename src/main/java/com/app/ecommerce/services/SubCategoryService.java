package com.app.ecommerce.services;

import com.app.ecommerce.dtos.SubCategoryDTO;
import com.app.ecommerce.models.SubCategory;
import com.app.ecommerce.repositories.SubCategoryRepository;
import com.app.ecommerce.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubCategoryService {

    @Autowired
    SubCategoryRepository repository;

    @Autowired
    ModelMapper<SubCategoryDTO, SubCategory> mapper;

    SubCategory findById(long idSubCategory) {
        return repository.getById(idSubCategory);
    }

    List<SubCategory> findAll() {
        return repository.findAll();
    }

    SubCategory save(SubCategory subCategory) {
        return repository.save(subCategory);
    }

    void delete(long idSubCategory) {
        repository.deleteById(idSubCategory);
    }

}
