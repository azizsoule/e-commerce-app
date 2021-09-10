package com.app.ecommerce.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Table(name = "comment")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComment;

    private float rating = 0;

    private String content;

    private boolean blocked = false;

    @DateTimeFormat(pattern = "yyyy-mm-dd", fallbackPatterns = "yyyy/mm/dd")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "article_id_article")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @PrePersist
    public void prePersist() {
        date = new Date();
    }

}