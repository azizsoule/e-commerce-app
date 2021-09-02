package com.app.ecommerce.services;

import com.app.ecommerce.repositories.WishItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishItemService {

    @Autowired
    WishItemRepository repository;

}
