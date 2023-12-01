package com.octo.masterclass.api;

import com.octo.masterclass.api.persistence.Panier;
import com.octo.masterclass.api.persistence.PanierRepository;
import com.octo.masterclass.api.persistence.Plat;
import com.octo.masterclass.api.persistence.PlatRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
