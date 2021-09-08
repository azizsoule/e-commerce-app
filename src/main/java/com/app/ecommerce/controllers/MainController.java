package com.app.ecommerce.controllers;

import com.app.ecommerce.models.Catalog;
import com.app.ecommerce.models.Category;
import com.app.ecommerce.services.CatalogService;
import com.app.ecommerce.services.CategoryService;
import com.app.ecommerce.utils.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Random;
import java.util.Set;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    CatalogService catalogService;

    @Autowired
    CategoryService categoryService;

    @GetMapping("")
    public String home() {
        return Route.redirectTo(Route.INDEX);
    }

    @GetMapping(Route.INDEX)
    public String index(Model model) {
        List<Catalog> catalogs = catalogService.findAll();
        Random random = new Random();
        Catalog randomCatalog = catalogs.get(random.nextInt(catalogs.size()));
        Set<Category> categories = randomCatalog.getCategories();
        model.addAttribute("catalogs", catalogs);
        model.addAttribute("categories", categoryService.findAll());
        return Route.INDEX;
    }

    @GetMapping(Route.ABOUT_US)
    public String aboutUs() {
        return Route.ABOUT_US;
    }

    @GetMapping(Route.BANNER_EFFECT)
    public String bannerEffect() {
        return Route.BANNER_EFFECT;
    }

    @GetMapping(Route.CHECKOUT)
    public String checkout() {
        return Route.CHECKOUT;
    }

    @GetMapping(Route.CONTACT)
    public String contact() {
        return Route.CONTACT;
    }

    @GetMapping(Route.FAQ)
    public String faq() {
        return Route.FAQ;
    }

    @GetMapping(Route.GIFT_VOUCHER)
    public String giftVoucher() {
        return Route.GIFT_VOUCHER;
    }

    @GetMapping(Route.MY_ACCOUNT)
    public String myAccount() {
        return Route.MY_ACCOUNT;
    }

    @GetMapping(Route.QUICK_VIEW)
    public String quickview() {
        return Route.QUICK_VIEW;
    }

    @GetMapping(Route.SITEMAP)
    public String sitemap() {
        return Route.SITEMAP;
    }

    @GetMapping(Route.TYPOGRAPHY)
    public String typography() {
        return Route.TYPOGRAPHY;
    }

    @GetMapping(Route.WISHLIST)
    public String wishlist() {
        return Route.WISHLIST;
    }

}

