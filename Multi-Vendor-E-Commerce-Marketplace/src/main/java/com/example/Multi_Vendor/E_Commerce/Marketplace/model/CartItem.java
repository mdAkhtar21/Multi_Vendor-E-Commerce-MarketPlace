package com.example.Multi_Vendor.E_Commerce.Marketplace.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany
    @JsonIgnore
    private Cart cart;

    private Product product;
    private String size;
    private  int quantity=1;
    private Integer mrpPrice;
    private Integer sellingPrice;
    private Long userId;
}
