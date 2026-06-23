package com.example.Multi_Vendor.E_Commerce.Marketplace.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String code;
    private double discountPercentage;
    private LocalDate validateStartDate;
    private LocalDate validEndDate;

    private double minimumOrderValue;
    private boolean isActive;

    @ManyToMany(mappedBy = "usedCoupons")
    private Set<User> uesrUsedBy=new HashSet<>();
}
