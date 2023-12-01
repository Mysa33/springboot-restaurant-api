package com.octo.masterclass.api;

import com.octo.masterclass.api.persistence.Ingredient;
import com.octo.masterclass.api.persistence.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {
    @Autowired
    private IngredientRepository repository;


    public IngredientController(IngredientRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    Iterable<Ingredient> listerIngredient(){ return repository.findAll(); }
}
