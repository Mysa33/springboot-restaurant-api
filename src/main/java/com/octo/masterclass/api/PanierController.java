package com.octo.masterclass.api;

import com.octo.masterclass.api.persistence.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/paniers")
public class PanierController {

    private final PanierRepository repository;

    public PanierController (PanierRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Panier> listerPanier(){
        return repository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Panier> getPanier(@PathVariable("id") String idPanier) {
        long id = Long.parseLong(idPanier);
        return repository.findById(id);
    }
}
