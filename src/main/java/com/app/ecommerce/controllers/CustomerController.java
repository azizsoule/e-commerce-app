package com.app.ecommerce.controllers;

import com.app.ecommerce.models.Address;
import com.app.ecommerce.models.Article;
import com.app.ecommerce.models.Customer;
import com.app.ecommerce.models.Order;
import com.app.ecommerce.services.*;
import com.app.ecommerce.utils.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    OrderService orderService;

    @GetMapping(Route.REGISTER)
    String register(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("address", new Address());
        model.addAttribute("sexes", sexService.findAll());
        model.addAttribute("cities", cityService.findAll());
        return Route.REGISTER;
    }

    @PostMapping(Route.REGISTER)
    String register(Customer customer, Address address, RedirectAttributes redirectAttributes) {
        try {
            address.setFirstName(customer.getFirstName());
            address.setLastName(customer.getLastName());
            address.setDef(true);
            customer.getAddresses().add(address);
            customer = customerService.register(customer);
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
        customer = customerService.findById(customer.getId());

        var total = new Object() {
            public float subTotal = 0;
            public float discountTotal = 0;
        };

        customer.getCartItems().forEach(cartItem -> {
            Article article = cartItem.getArticle();
            total.subTotal = total.subTotal + (cartItem.getQuantity() * article.getPrice());
            article.getDiscounts().forEach(discount -> {
                float discountAmount = 0;
                if (discount.isPercentage()) {
                    discountAmount = (article.getPrice() * discount.getDiscountPercent()) / 100;
                } else {
                    discountAmount = discount.getDiscountAmount();
                }
                total.discountTotal = total.discountTotal + discountAmount;
            });
        });

        model.addAttribute("total", total);
        model.addAttribute("cartItems", customer.getCartItems());
        return Route.CART;
    }

    @GetMapping(Route.ORDER_HISTORY)
    String orderHistory(@AuthenticationPrincipal Customer customer, Model model) {
        customer = customerService.findById(customer.getId());
        model.addAttribute("orders", customer.getOrders());
        return Route.ORDER_HISTORY;
    }

    @GetMapping(Route.ORDER_INFORMATION+"/{id}")
    String orderInformation(@PathVariable String id, Model model) {
        Order order = orderService.findById(Long.parseLong(id));
        model.addAttribute("order", order);
        return Route.ORDER_INFORMATION;
    }

}
