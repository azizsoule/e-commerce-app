package com.app.ecommerce.services;

import com.app.ecommerce.models.Article;
import com.app.ecommerce.models.Comment;
import com.app.ecommerce.models.Customer;
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

    public Article addComment(Customer customer, Article article, Comment comment) {
        comment.setArticle(article);
        comment.setCustomer(customer);
        article.getComments().add(comment);
        article.setRatingSum(article.getRatingSum()+comment.getRating());
        return this.update(article);
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
