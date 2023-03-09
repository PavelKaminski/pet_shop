package com.kaminski.overone.pet_shop.controllers;


import com.kaminski.overone.pet_shop.models.ItemModel;
import com.kaminski.overone.pet_shop.repos.ItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/item/{id}")
public class ItemController {

    private final ItemRepository repository;

    public ItemController(ItemRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String showItem(@PathVariable("id") long id, Model model) {

        ItemModel exactItem = new ItemModel();
        if (id != 0) {
            exactItem = repository.findById(id).get();
        }
        model.addAttribute("item", exactItem);
        return "item";
    }
}
