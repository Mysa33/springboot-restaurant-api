package com.octo.masterclass.api.persistence;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Panier {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;

    int customerId;
    @Column
    Double total;
    @OneToMany
    @JoinColumn(name="Plat_ID")
    List<Plat> plats;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setPlats(List<Plat> plats) {
        this.plats = plats;
    }
    public Panier() {}
    public Panier(int id, int customerId, Double total, List<Plat> plats) {
        this.id = id;
        this.customerId = customerId;
        this.total = total;
        this.plats = plats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<Plat> getPlats() {
        return plats;
    }

    public void setFormules(List<Plat> plats) {
        this.plats = plats;
    }
}
