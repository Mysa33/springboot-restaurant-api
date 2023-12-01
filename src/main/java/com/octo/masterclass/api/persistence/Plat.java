package com.octo.masterclass.api.persistence;

import com.octo.masterclass.api.persistence.Ingredient;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Plat {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        int id;

        @Column
        String nom;

        @Column
        Double prix;

        @Column
        int tempsPreparation;

        @OneToMany
        @JoinColumn(name="Plat_ID")
        List<Ingredient> ingredients;

        public Plat() {
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

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

        public int getTempsPreparation() {
                return tempsPreparation;
        }

        public void setTempsPreparation(int tempsPreparation) {
                this.tempsPreparation = tempsPreparation;
        }

        public List<Ingredient> getIngredients() {
                return ingredients;
        }

        public void setIngredients(List<Ingredient> ingredients) {
                this.ingredients = ingredients;
        }

        public Plat(String nom, Double prix, int tempsPreparation, List<Ingredient> ingredients) {
                this.nom = nom;
                this.prix = prix;
                this.tempsPreparation = tempsPreparation;
                this.ingredients = ingredients;
        }
}
