package com.kaminski.overone.pet_shop.controllers;


import com.kaminski.overone.pet_shop.models.ItemModel;
import com.kaminski.overone.pet_shop.repos.ItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/allitems")
public class AllItemsController {

    private final ItemRepository repository;

    public AllItemsController(ItemRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String showAllItems(Model model) {
        List<ItemModel> items = (List<ItemModel>) repository.findAll();
        model.addAttribute("allitems", items);
        return "allitems";
    }
}
