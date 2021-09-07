package com.app.ecommerce.controllers;

import com.app.ecommerce.dtos.AddressDTO;
import com.app.ecommerce.dtos.ArticleDTO;
import com.app.ecommerce.dtos.CustomerDTO;
import com.app.ecommerce.models.Customer;
import com.app.ecommerce.services.*;
import com.app.ecommerce.utils.Route;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class CustomerController {

    @Autowired
    SexService sexService;

    @Autowired
    CustomerService customerService;

    @Autowired
    CityService cityService;

    @Autowired
    AddressService addressService;

    @Autowired
    ArticleService articleService;

    @GetMapping(Route.REGISTER)
    String register(Model model) {
        model.addAttribute("customer", new CustomerDTO());
        model.addAttribute("address", new AddressDTO());
        model.addAttribute("sexes", sexService.findAll());
        model.addAttribute("cities", cityService.findAll());
        return Route.REGISTER;
    }

    @PostMapping(Route.REGISTER)
    String register(CustomerDTO customer, AddressDTO address, RedirectAttributes redirectAttributes) {
        try {
            customer = customerService.register(customer);
            address.setFirstName(customer.getFirstName());
            address.setLastName(customer.getLastName());
            address.setCustomerId(customer.getId());
            address.setDef(true);
            address = addressService.save(address);
            redirectAttributes.addFlashAttribute("success", "Succès - Inscription réussie !");
        } catch (NullPointerException exception) {
            redirectAttributes.addFlashAttribute("failure", "Erreur - L'adresse e-mail que vous avez entré est déja utilisée !");
        } catch (Exception exception) {
            redirectAttributes.addFlashAttribute("failure", "Erreur - L'inscription a échoué car une erreur est survenue. Veuillez réessayer svp !");
        }
        return Route.redirectTo(Route.REGISTER);
    }

    @GetMapping(Route.LOGIN)
    String login() {
        return Route.LOGIN;
    }

    @GetMapping(Route.CART)
    String cart(@AuthenticationPrincipal Customer customer, Model model) {
        var total = new Object() {
            float subTotal = 0;
            float discountTotal = 0;
        };
        CustomerDTO customerDTO = customerService.findById(customer.getId());
        customerDTO.getCartItems().forEach(cartItemDTO -> {
            ArticleDTO article = articleService.findById(cartItemDTO.getArticleIdArticle());
            total.subTotal = total.subTotal + (cartItemDTO.getQuantity() * article.getPrice());
            article.getDiscounts().forEach(discountDTO -> {
                float discountAmount = 0;
                if (discountDTO.getPercentage()) {
                    discountAmount = (article.getPrice() * discountDTO.getDiscountPercent()) / 100;
                } else {
                    discountAmount = discountDTO.getDiscountAmount();
                }
                total.discountTotal = total.discountTotal + discountAmount;
            });
        });
        model.addAttribute("subTotal", total.subTotal);
        model.addAttribute("discountTotal", total.discountTotal);
        model.addAttribute("cartItems", customerDTO.getCartItems());
        return Route.CART;
    }

}
