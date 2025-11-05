package com.mishri.ecommerceApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/ecommerce")
public class CategoryController {

    @GetMapping
    public String getCategory(){
        return "Hello i am first Controller";
    }

}
