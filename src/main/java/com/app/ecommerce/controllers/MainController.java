package com.app.ecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private static final String URI = "/";
    private static final String VIEW = "index";

    @GetMapping(URI)
    public String index() {
        return VIEW;
    }

    @GetMapping("index")
    public String ind() {
        return VIEW;
    }

    @GetMapping("/about-us")
    public String aboutUs() {
        return "about-us";
    }

    @GetMapping("/banner-effect")
    public String bannerEffect() {
        return "banner-effect";
    }

    @GetMapping("/cart")
    public String cart() {
        return "cart";
    }

    @GetMapping("/category")
    public String category() {
        return "category";
    }

    @GetMapping("/checkout")
    public String checkout() {
        return "checkout";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/faq")
    public String faq() {
        return "faq";
    }

    @GetMapping("/gift-voucher")
    public String giftVoucher() {
        return "gift-voucher";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/my-account")
    public String myAccount() {
        return "my-account";
    }

    @GetMapping("/order-history")
    public String orderHistory() {
        return "order-history";
    }

    @GetMapping("/order-information")
    public String orderInformation() {
        return "order-information";
    }

    @GetMapping("/product")
    public String product() {
        return "product";
    }

    @GetMapping("/quickview")
    public String quickview() {
        return "quickview";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/sitemap")
    public String sitemap() {
        return "sitemap";
    }

    @GetMapping("/typography")
    public String typography() {
        return "typography";
    }

    @GetMapping("/wishlist")
    public String wishlist() {
        return "wishlist";
    }

}

