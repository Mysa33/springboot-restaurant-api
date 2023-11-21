package com.octo.masterclass.api;

import com.octo.masterclass.api.persistence.Plat;
import com.octo.masterclass.api.persistence.PlatRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PlatControllerTest {
    @InjectMocks
    private PlatRepository repository;

    PlatControllerTest(PlatRepository repository) {
        this.repository = repository;
    }

    @Test
    void should_return_list_of_plats() throws IOException {
        PlatRepository repository = this.repository;
        List<Plat> plats = (List<Plat>) new PlatController(repository).listerPlat();
        assertThat(plats.size()).isEqualTo(4);
    }
}