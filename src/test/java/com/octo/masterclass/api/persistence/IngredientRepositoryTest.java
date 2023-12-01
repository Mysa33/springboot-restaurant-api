package com.octo.masterclass.api.persistence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class IngredientRepositoryTest {
    // Given
    com.octo.masterclass.api.persistence.Ingredient fromage = new com.octo.masterclass.api.persistence.Ingredient("fromage", true, 0);
    com.octo.masterclass.api.persistence.Ingredient oignon = new com.octo.masterclass.api.persistence.Ingredient("oignon", false, 1);
    com.octo.masterclass.api.persistence.Ingredient piment = new com.octo.masterclass.api.persistence.Ingredient("piment", false, 4);
    com.octo.masterclass.api.persistence.Ingredient fromageChelou = new com.octo.masterclass.api.persistence.Ingredient("fromageChelou", true, 0);

    @Autowired
    IngredientRepository repository;
    @BeforeEach
    void setUp() {
        repository.save(fromageChelou);
        repository.save(fromage);
        repository.save(oignon);
        repository.save(piment);
    }

    @Test
    @DisplayName("Unit test for plat repository")
    void should_return_list_of_plats() throws IOException {
        // When
        List<Ingredient> ingredient = (List<Ingredient>) repository.findAll();
        // Then
        assertThat(ingredient.size()).isEqualTo(8);
    }
}