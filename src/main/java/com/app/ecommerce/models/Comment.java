package com.app.ecommerce.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "comment")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComment;

    private int rating;

    private String content;

    private boolean blocked;

    @ManyToOne
    @JoinColumn(name = "article_id_article")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "user_id_user")
    private User user;

}