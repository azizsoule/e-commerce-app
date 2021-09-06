package com.app.ecommerce.controllers;

import com.app.ecommerce.dtos.AddressDTO;
import com.app.ecommerce.dtos.CustomerDTO;
import com.app.ecommerce.services.AddressService;
import com.app.ecommerce.services.CityService;
import com.app.ecommerce.services.CustomerService;
import com.app.ecommerce.services.SexService;
import com.app.ecommerce.utils.Route;
import org.springframework.beans.factory.annotation.Autowired;
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

}
