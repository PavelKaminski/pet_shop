package com.kaminski.overone.pet_shop.controllers;


import com.kaminski.overone.pet_shop.models.ItemModel;
import com.kaminski.overone.pet_shop.repos.ItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/additem")
public class AddItemController {

    private final ItemRepository repository;

    public AddItemController(ItemRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public String postData (@RequestParam String name, @RequestParam String price, @RequestParam String weight,
                            @RequestParam String length, @RequestParam String width, @RequestParam String height,
                            @RequestParam String description){
        ItemModel item = new ItemModel();
        item.setName(name);
        item.setPrice(price);
        item.setWeight(weight);
        item.setLength(length);
        item.setWidth(width);
        item.setHeight(height);
        item.setDescription(description);

        repository.save(item);
        return "index";
    }

    @GetMapping
    public String addItem() {
        return "additem";
    }
}
