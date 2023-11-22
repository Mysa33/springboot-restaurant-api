package com.octo.masterclass.restaurant;

import com.octo.masterclass.restaurant.Formule;
import com.octo.masterclass.restaurant.Plat;

import java.util.List;

public interface IFormule {
    String nom = null;
    List<Plat> composition = null;
    public String getNom();
    public void setNom(String nom);
    public List<Plat> getComposition();
}
