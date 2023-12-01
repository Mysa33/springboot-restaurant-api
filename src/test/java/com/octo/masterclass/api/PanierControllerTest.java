package com.octo.masterclass.api;

import com.octo.masterclass.api.persistence.Panier;
import com.octo.masterclass.api.persistence.PanierRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class PanierControllerTest {
    //Given
    com.octo.masterclass.api.persistence.Ingredient fromage = new com.octo.masterclass.api.persistence.Ingredient("fromage", true, 0);
    com.octo.masterclass.api.persistence.Ingredient oignon = new com.octo.masterclass.api.persistence.Ingredient("oignon", false, 1);
    com.octo.masterclass.api.persistence.Ingredient piment = new com.octo.masterclass.api.persistence.Ingredient("piment", false, 0);
    com.octo.masterclass.api.persistence.Ingredient fromageChelou = new com.octo.masterclass.api.persistence.Ingredient("fromage", true, 0);
    com.octo.masterclass.api.persistence.Plat platChelou = new com.octo.masterclass.api.persistence.Plat("plat chelou", 1.50 , 1, List.of(piment , oignon, fromage, fromageChelou));
    com.octo.masterclass.api.persistence.Panier panier = new com.octo.masterclass.api.persistence.Panier(1, 120,20.5, List.of(platChelou));
    @Autowired
    private PanierRepository repository;
    @BeforeEach
    void setup() {
        repository.save(panier);
    }

    void should_return_list_of_paniers() throws IOException {
        List<Panier> panier = (List<Panier>) new PanierController(repository).listerPanier();
        assertThat(panier.size()).isEqualTo(1);
    }
}