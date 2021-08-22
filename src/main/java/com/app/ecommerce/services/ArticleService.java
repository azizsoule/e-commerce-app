package com.app.ecommerce.services;

import com.app.ecommerce.models.Article;
import com.app.ecommerce.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository repository;
    
    public Article findById(long idArticle){
        return repository.getOne(idArticle);
    }
    public List<Article> findAll(){
        return repository.findAll();
    }
    public Article save(Article article){
        return repository.save(article);
    }
}
