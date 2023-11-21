package com.octo.masterclass.restaurant;

import com.octo.masterclass.restaurant.Ingredient;

import java.util.List;

public interface IPlat {
    String nom = null;
    Double prix = null;
    List<Ingredient> ingredients = null;
    public String getNom();
    public void setNom(String nom);
    public void setPrix(Double prix);
    public List<Ingredient> getIngredients();
    public void setIngredients(List<Ingredient> ingredients);
}
