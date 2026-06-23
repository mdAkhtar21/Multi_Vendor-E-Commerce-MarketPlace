package com.example.Multi_Vendor.E_Commerce.Marketplace.model;

import com.example.Multi_Vendor.E_Commerce.Marketplace.domain.AccountStatus;
import com.example.Multi_Vendor.E_Commerce.Marketplace.domain.USER_ROLE;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String sellerName;
    private String mobile;

    @Column(unique = true,nullable = true)
    private String email;
    private String password;
    @Embedded
    private BussinessDetails bussinessDetails=new BussinessDetails();
    @Embedded
    private BankDetails bankDetails=new BankDetails();

    @OneToOne(cascade = CascadeType.ALL)
    private Address pickupAddress=new Address();

    private String GSTIN;

    private USER_ROLE role;

    private boolean isEmailVerified=false;

    private AccountStatus accountStatus=AccountStatus.PENDING_VERIFICATION;

}
