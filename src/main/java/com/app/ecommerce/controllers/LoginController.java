package com.app.ecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    private static final String URI = "/login";
    private static final String VIEW = "login";

    @GetMapping(URI)
    private String getLogin() {
        return VIEW;
    }

}
