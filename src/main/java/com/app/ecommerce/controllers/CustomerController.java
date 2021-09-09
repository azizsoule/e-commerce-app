package com.app.ecommerce.controllers;

import com.app.ecommerce.exceptions.CustomerEmailAlreadyExistException;
import com.app.ecommerce.models.*;
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

    @Autowired
    PaymentMethodService paymentMethodService;

    @Autowired
    CartItemService cartItemService;

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
            customerService.register(customer, address);
            redirectAttributes.addFlashAttribute("success", "Succès - Inscription réussie. Vous pouvez vous connecter à votre compte en utilisant votre email et votre mot de passe !");
        } catch (CustomerEmailAlreadyExistException exception) {
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

    @GetMapping(Route.CART+"/remove/{cartItemId}")
    public String removeCartItemFromCart(@PathVariable String cartItemId) {
        cartItemService.deleteById(Long.parseLong(cartItemId));
        return Route.redirectTo(Route.CART);
    }

    @GetMapping(Route.CHECKOUT+"/remove/{cartItemId}")
    public String removeCartItemFromCheckout(@PathVariable String cartItemId) {
        cartItemService.deleteById(Long.parseLong(cartItemId));
        return Route.redirectTo(Route.CHECKOUT);
    }

    @PostMapping(Route.CART+"/update")
    public String updateCartItemFromCart(CartItem emptyCartItem) {
        CartItem cartItem1 = cartItemService.findById(emptyCartItem.getIdItem());
        cartItem1.setQuantity(emptyCartItem.getQuantity());
        cartItemService.update(cartItem1);
        return Route.redirectTo(Route.CART);
    }

    @PostMapping(Route.CHECKOUT+"/update")
    public String updateCartItemFromCheckout(CartItem cartItem) {
        CartItem cartItem1 = cartItemService.findById(cartItem.getIdItem());
        cartItem1.setQuantity(cartItem.getQuantity());
        cartItemService.update(cartItem1);
        return Route.redirectTo(Route.CHECKOUT);
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

    @GetMapping(Route.CHECKOUT)
    public String checkout(@AuthenticationPrincipal Customer customer, Model model) {

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
        model.addAttribute("customer", customer);
        model.addAttribute("paymentMethods", paymentMethodService.findAll());
        model.addAttribute("order", new Order());
        return Route.CHECKOUT;
    }

}
