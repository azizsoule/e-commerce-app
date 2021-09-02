package com.app.ecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private static final String URI = "/home";
    private static final String VIEW = "index";

    @GetMapping(URI)
    public String index() {
        return VIEW;
    }

}
