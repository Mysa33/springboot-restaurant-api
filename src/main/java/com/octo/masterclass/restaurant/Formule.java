package com.octo.masterclass.restaurant;

import java.util.List;

public class Formule implements IFormule {
    String nom;
    List<Plat> composition;

    public Formule(String nom, List<Plat> composition) {
        this.nom = nom;
        this.composition = composition;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Plat> getComposition() {
        return composition;
    }

    public void setComposition(List<Plat> composition) {
        this.composition = composition;
    }
}
