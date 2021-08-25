package com.app.ecommerce.services;

import com.app.ecommerce.dtos.CommentDTO;
import com.app.ecommerce.models.Comment;
import com.app.ecommerce.repositories.CommentRepository;
import com.app.ecommerce.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    CommentRepository repository;

    @Autowired
    ModelMapper<CommentDTO, Comment> mapper;

    Comment findById(long idComment) {
        return repository.getById(idComment);
    }

    List<Comment> findAll() {
        return repository.findAll();
    }

    Comment save(Comment comment) {
        return repository.save(comment);
    }

    void delete(long idComment) {
        repository.deleteById(idComment);
    }

}
