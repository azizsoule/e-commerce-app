package com.app.ecommerce.repositories;

import com.app.ecommerce.models.UserPaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPaymentMethodRepository extends JpaRepository<UserPaymentMethod, Long> {
}