package com.octo.masterclass;

import com.octo.masterclass.api.persistence.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MasterclassApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(com.octo.masterclass.MasterclassApplication.class, args);
	}
	@Autowired
	com.octo.masterclass.api.persistence.PlatRepository platRepository;
	@Autowired
	com.octo.masterclass.api.persistence.IngredientRepository ingredientRepository;
	@Autowired
	com.octo.masterclass.api.persistence.PanierRepository panierRepository;

	@Override
	public void run(String... args) throws Exception {

		com.octo.masterclass.api.persistence.Ingredient fromage = new com.octo.masterclass.api.persistence.Ingredient("fromage", true, 0);
		com.octo.masterclass.api.persistence.Ingredient oignon = new com.octo.masterclass.api.persistence.Ingredient("oignon", false, 1);
		com.octo.masterclass.api.persistence.Ingredient piment = new com.octo.masterclass.api.persistence.Ingredient("piment", false, 0);
		com.octo.masterclass.api.persistence.Ingredient fromageChelou = new com.octo.masterclass.api.persistence.Ingredient("fromage", true, 0);
		com.octo.masterclass.api.persistence.Plat platChelou = new com.octo.masterclass.api.persistence.Plat("plat chelou", 1.50 , 1, List.of(piment , oignon, fromage, fromageChelou));
		Iterable<Ingredient> ingredients = List.of(fromage, oignon, piment, fromageChelou);
		com.octo.masterclass.api.persistence.Panier panier = new com.octo.masterclass.api.persistence.Panier(1, 120,20.5, List.of(platChelou));

		ingredientRepository.saveAll(ingredients);
		platRepository.save(platChelou);
		panierRepository.save(panier);
	}
}
