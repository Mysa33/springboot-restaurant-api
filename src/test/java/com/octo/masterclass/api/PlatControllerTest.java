package com.octo.masterclass.api;

import com.octo.masterclass.api.persistence.Plat;
import com.octo.masterclass.api.persistence.PlatRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
@DataJpaTest
class PlatControllerTest {
    //Given
    com.octo.masterclass.api.persistence.Ingredient fromage = new com.octo.masterclass.api.persistence.Ingredient("fromage", true, 0);
    com.octo.masterclass.api.persistence.Ingredient oignon = new com.octo.masterclass.api.persistence.Ingredient("oignon", false, 1);
    com.octo.masterclass.api.persistence.Ingredient piment = new com.octo.masterclass.api.persistence.Ingredient("piment", false, 0);
    com.octo.masterclass.api.persistence.Ingredient fromageChelou = new com.octo.masterclass.api.persistence.Ingredient("fromage", true, 0);
    com.octo.masterclass.api.persistence.Plat platChelou = new com.octo.masterclass.api.persistence.Plat("plat chelou", 1.50 , 1, List.of(piment , oignon, fromage, fromageChelou));

    @Autowired
    private PlatRepository repository;
    @BeforeEach
    void setUp() {
        repository.save(platChelou);
    }

    @Test
    void should_return_list_of_plats() throws IOException {
        //When
        List<Plat> plats = (List<Plat>) new PlatController(repository).listerPlat();
        //Then
        assertThat(plats.size()).isEqualTo(2);
    }
}