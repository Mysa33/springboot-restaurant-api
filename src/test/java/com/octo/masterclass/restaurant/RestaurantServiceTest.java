package com.octo.masterclass.restaurant;

import com.octo.masterclass.api.FormuleController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RestaurantServiceTest {
    private RestaurantService service;
    @Test
    @DisplayName("Unit test for restaurant service")
    void should_return_price() throws IOException {
        Formule bestOf = new Formule("best Of", List.of(
                new Plat("big mac", 5.0, List.of()),
                new Plat("petite frite", 5.0, List.of())
        ));
        Double price;
        price = new RestaurantService().calculerPrixFormule(bestOf);
        assertThat(price).isEqualTo(10);
    }
}