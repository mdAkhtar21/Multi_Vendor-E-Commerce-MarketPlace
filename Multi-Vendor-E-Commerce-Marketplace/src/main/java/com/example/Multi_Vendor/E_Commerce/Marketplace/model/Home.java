package com.example.Multi_Vendor.E_Commerce.Marketplace.model;

import lombok.Data;

import java.util.List;

@Data
public class Home {

    private List<HomeCategory> grid;
    private List<HomeCategory> showByCategories;
    private List<HomeCategory>electricCategories;
    private List<HomeCategory> dealCategories;
    private List<Deal> deals;
}
