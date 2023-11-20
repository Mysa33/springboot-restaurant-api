package com.octo.masterclass.restaurant;

import com.octo.masterclass.domain.IPlat;

import java.util.List;

public class Plat implements IPlat {
    String nom;
    Double prix;

    public Plat(String nom, Double prix, List<Ingredient> ingredients) {
        this.nom = nom;
        this.prix = prix;
        this.ingredients = ingredients;
    }

    List<Ingredient> ingredients;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}

