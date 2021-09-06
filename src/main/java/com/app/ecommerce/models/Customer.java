package com.app.ecommerce.models;

import com.app.ecommerce.models.supers.Person;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

@NoArgsConstructor
@Setter
@Getter
@Entity
public class Customer extends Person implements UserDetails {

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Address> addresses;

    @OneToMany(mappedBy = "customer")
    private Set<CustomerPaymentMethod> customerPaymentMethods;

    @OneToMany(mappedBy = "customer")
    private Set<CartItem> cartItems;

    @OneToMany(mappedBy = "customer")
    private Set<Comment> comments;

    @OneToMany(mappedBy = "customer", orphanRemoval = true)
    private Set<Order> orders;

    @OneToMany(mappedBy = "customer", orphanRemoval = true)
    private Set<WishItem> wishItems;

    @ManyToMany(mappedBy = "customers")
    private Set<Discount> discounts;

    @ManyToOne
    @JoinColumn(name = "customer_type_id_customer_type")
    private CustomerType customerType;

    @ManyToOne
    @JoinColumn(name = "sex_id_sex")
    private Sex sex;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("CUSTOMER"));
        return authorities;
    }

    @Override
    public String getUsername() {
        return "";
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !this.isBlocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
