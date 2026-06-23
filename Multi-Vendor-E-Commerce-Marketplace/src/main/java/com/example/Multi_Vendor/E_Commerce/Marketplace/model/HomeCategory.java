package com.example.Multi_Vendor.E_Commerce.Marketplace.model;


import com.example.Multi_Vendor.E_Commerce.Marketplace.domain.HomeCategorySection;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class HomeCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String image;
    private String CategoryId;
    private HomeCategorySection section;
}
