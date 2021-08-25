package com.app.ecommerce.services;

import com.app.ecommerce.dtos.CategoryDTO;
import com.app.ecommerce.models.Category;
import com.app.ecommerce.repositories.CategoryRepository;
import com.app.ecommerce.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository repository;

    @Autowired
    ModelMapper<CategoryDTO, Category> mapper;

    Category findById(long idCategory) {
        return repository.getById(idCategory);
    }

    List<Category> findAll() {
        return repository.findAll();
    }

    Category save(Category category) {
        return repository.save(category);
    }

    void delete(long idCategory) {
        repository.deleteById(idCategory);
    }

}
