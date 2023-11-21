package com.octo.masterclass.api;

import com.octo.masterclass.api.persistence.Plat;
import com.octo.masterclass.api.persistence.PlatRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

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
}
