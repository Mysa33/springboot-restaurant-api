package com.octo.masterclass.restaurant;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class RestaurantService {
    public Double calculerPrixFormule(Formule formule){
        return formule.composition.stream()
                .map(Plat::getPrix)
                .reduce(Double::sum)
                .orElse(0.0);
    }
}
