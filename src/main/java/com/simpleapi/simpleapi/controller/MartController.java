package com.simpleapi.simpleapi.controller;

import com.simpleapi.simpleapi.service.MartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class MartController {

    @Autowired
    private MartService martService;

    @GetMapping("/{productid}")
    public String getProducts(@PathVariable("productid") String productId, Model model) {
        String productDetails = martService.getProductById(productId);
        model.addAttribute("productDetails", productDetails); // Adding data to the view (optional)
        return "productView"; // Assuming we have a view named 'productView'
    }

}
