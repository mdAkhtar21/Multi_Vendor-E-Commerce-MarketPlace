package com.example.Multi_Vendor.E_Commerce.Marketplace.controller;

import com.example.Multi_Vendor.E_Commerce.Marketplace.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public ApiResponse HomeConterlloer(){
        ApiResponse apiResponse=new ApiResponse();
        apiResponse.setName("Hello world how are you");
        return apiResponse;
    }
}
