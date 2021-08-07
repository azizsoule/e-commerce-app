package com.app.ecommerce.models;

import com.app.ecommerce.models.utils.Item;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "order_item")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class OrderItem extends Item {

    @OneToOne
    @JoinColumn(name = "article_id_article")
    private Article article;

}