package com.octo.masterclass.api;

import com.octo.masterclass.api.persistence.Ingredient;
import com.octo.masterclass.api.persistence.IngredientRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class IngredientControllerTest {
    @Autowired
    private IngredientRepository repository;
    com.octo.masterclass.api.persistence.Ingredient fromage = new com.octo.masterclass.api.persistence.Ingredient("fromage", true, 0);
    com.octo.masterclass.api.persistence.Ingredient oignon = new com.octo.masterclass.api.persistence.Ingredient("oignon", false, 1);
    com.octo.masterclass.api.persistence.Ingredient piment = new com.octo.masterclass.api.persistence.Ingredient("piment", false, 0);
    com.octo.masterclass.api.persistence.Ingredient fromageChelou = new com.octo.masterclass.api.persistence.Ingredient("fromage", true, 0);
    Iterable<Ingredient> ingredients = List.of(fromage, oignon, piment, fromageChelou);

    @BeforeEach
    void setUp() {
        repository.saveAll(ingredients);
    }

    @Test
    void should_listerIngredient() {
        //When
        List<Ingredient> ingredient = (List<Ingredient>) new IngredientController(repository).listerIngredient();
        //Then
        assertThat(ingredient.size()).isEqualTo(8);
    }

    @Test
    void should_getIngredient() {
        //When
        Optional<Ingredient> ingredient = new IngredientController(repository).getIngredient("1");
        //Then
        assertThat((ingredient).get()).isNotNull();
        assertThat((ingredient).get()).hasFieldOrProperty("id");
    }

    @Test
    void should_creerIngredient() {
    }
}