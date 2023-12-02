package com.octo.masterclass.api;

import com.octo.masterclass.api.persistence.Ingredient;
import com.octo.masterclass.api.persistence.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id}")
    public Optional<Ingredient> getIngredient(@PathVariable("id") String idSIngredient) {
        long id = Long.parseLong(idSIngredient);
        return repository.findById(id);
    }

    @PostMapping
    public Ingredient creerIngredient(@RequestBody Ingredient ingredient) {
        return repository.save(ingredient);
    }
}
