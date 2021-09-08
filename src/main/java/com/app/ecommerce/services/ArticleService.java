package com.app.ecommerce.services;

import com.app.ecommerce.models.Article;
import com.app.ecommerce.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService extends BaseService<Article, Long> {

    @Autowired
    private ArticleRepository repository;

    @Override
    public Article findById(Long idUser) {
        return repository.getById(idUser);
    }

    @Override
    public List<Article> findAll() {
        return repository.findAll();
    }

    @Override
    public Article save(Article article) {
        return repository.save(article);
    }

    @Override
    public void deleteById(Long idUser) {
        repository.deleteById(idUser);
    }

    @Override
    public void delete(Article article) {
        repository.delete(article);
    }

}
