package com.octo.masterclass.api;

import com.octo.masterclass.restaurant.Formule;
import com.octo.masterclass.restaurant.Plat;
import com.octo.masterclass.restaurant.RestaurantService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FormuleControllerTest {
    @InjectMocks
    private RestaurantService service;

    @Test
    @DisplayName("Unit test for find all formules")
    void should_return_formules() throws IOException {
        List<Formule> formules = new FormuleController(service).getFormules();
        assertThat(formules.size()).isEqualTo(3);
    }
}