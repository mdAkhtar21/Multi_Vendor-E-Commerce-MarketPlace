package com.example.Multi_Vendor.E_Commerce.Marketplace.model;

import com.example.Multi_Vendor.E_Commerce.Marketplace.domain.PaymentMethod;
import com.example.Multi_Vendor.E_Commerce.Marketplace.domain.PaymentOrderStatus;
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
public class PaymentOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long amount;
    private PaymentOrderStatus status=PaymentOrderStatus.PENDING;
    private PaymentMethod paymentMethod;

    @ManyToOne
    private User user;

    @OneToMany
    private Set<Order>orders=new HashSet<>();

}
