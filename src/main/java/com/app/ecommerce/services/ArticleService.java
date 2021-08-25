package com.app.ecommerce.services;

import com.app.ecommerce.dtos.ArticleDTO;
import com.app.ecommerce.models.Article;
import com.app.ecommerce.repositories.ArticleRepository;
import com.app.ecommerce.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository repository;

    @Autowired
    ModelMapper<ArticleDTO, Article> mapper;
    
    public Article findById(long idArticle){
        return repository.getById(idArticle);
    }

    public List<Article> findAll(){
        return repository.findAll();
    }

    public Article save(Article article){
        return repository.save(article);
    }

    public void delete(long idArticle) {
        repository.deleteById(idArticle);
    }

}
