package com.app.ecommerce.apis;

import com.app.ecommerce.models.CartItem;
import com.app.ecommerce.models.WishItem;
import com.app.ecommerce.services.CartItemService;
import com.app.ecommerce.services.WishItemService;
import com.app.ecommerce.utils.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Route.API_ENDPOINT)
public class ShopControllerAPI {

    @Autowired
    CartItemService cartItemService;

    @Autowired
    WishItemService wishItemService;

    @PostMapping("/cart/add")
    public ResponseEntity<?> addToCart(@RequestBody CartItem cartItem) {
        cartItemService.save(cartItem);
        return new ResponseEntity<List<CartItem>>(cartItemService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/cart/remove/{id}")
    public ResponseEntity<?> removeFromCart(@PathVariable Long id) {
        cartItemService.deleteById(id);
        return new ResponseEntity<List<CartItem>>(cartItemService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/wishlist/add")
    public ResponseEntity<?> addToWishList(@RequestBody WishItem wishItem) {
        wishItemService.save(wishItem);
        return new ResponseEntity<List<WishItem>>(wishItemService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/wishlist/remove/{id}")
    public ResponseEntity<?> removeFromWishList(@PathVariable Long id) {
        wishItemService.deleteById(id);
        return new ResponseEntity<List<WishItem>>(wishItemService.findAll(), HttpStatus.OK);
    }

}
