package com.kaminski.overone.pet_shop.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/allitems")
public class AllItemsController {

    @GetMapping
    public String showAllItems() {
        return "allitems";
    }
}
