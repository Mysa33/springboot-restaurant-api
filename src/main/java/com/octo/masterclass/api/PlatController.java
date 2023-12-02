package com.octo.masterclass.api;

import com.octo.masterclass.api.persistence.Plat;
import com.octo.masterclass.api.persistence.PlatRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/plats")
public class PlatController {
    private final PlatRepository repository;

    public PlatController (PlatRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Plat> listerPlat(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Plat> getPlat(@PathVariable("id") String idPlat) {
        long id = Long.parseLong(idPlat);
        return repository.findById(id);
    }

    @PostMapping
    public Plat creerPlat(@RequestBody Plat plat) {
        return repository.save(plat);
    }
}
