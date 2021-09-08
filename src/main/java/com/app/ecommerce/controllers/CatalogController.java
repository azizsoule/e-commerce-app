package com.app.ecommerce.controllers;

import com.app.ecommerce.models.Article;
import com.app.ecommerce.services.ArticleService;
import com.app.ecommerce.services.SubCategoryService;
import com.app.ecommerce.utils.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CatalogController {

    @Autowired
    SubCategoryService subCategoryService;

    @Autowired
    ArticleService articleService;

    @GetMapping(Route.SUB_CATEGORY+"/{id}")
    String subCategory(@PathVariable String id, Model model) {
        model.addAttribute("articles", subCategoryService.findById(Long.parseLong(id)).getArticles());
        return Route.SUB_CATEGORY;
    }

    @GetMapping(Route.PRODUCT+"/{id}")
    String article(@PathVariable String id, Model model) {
        Article article = articleService.findById(Long.parseLong(id));
        model.addAttribute("article", article);

        return Route.PRODUCT;
    }


}
