package com.app.ecommerce.controllers;

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

    @GetMapping(Route.SUB_CATEGORY+"/{id}")
    String subCategory(@PathVariable String id, Model model) {
        model.addAttribute("subCategory", subCategoryService.findById(Long.parseLong(id)));
        return Route.SUB_CATEGORY;
    }

}
