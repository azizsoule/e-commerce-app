package com.app.ecommerce.controllers;

import com.app.ecommerce.models.Article;
import com.app.ecommerce.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    private static final String URI="/home";
    private static final String VIEW="login";

    @Autowired
    private ArticleService service;

    @GetMapping(URI)
    public String index(){
        Article art = new Article();
        art.setLabel("Iphone12");
        art.setPrice(150000);
        art.setDescription("Le meilleur telephone de l'année");
        service.save(art);
        return VIEW;
    }
}
