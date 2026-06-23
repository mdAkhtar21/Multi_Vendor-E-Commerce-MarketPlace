package com.example.Multi_Vendor.E_Commerce.Marketplace.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<CartItem> cartItems=new HashSet<>();

    private double totalSellingPrice;
    private int totalItem;
    private int totalMRPPrice;
    private int discount;
    private String couponCode;

}
