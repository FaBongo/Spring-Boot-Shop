package com.store.MyShop.Models;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Category categorie;

    public  Product()
    {
        super();
    }
    public Product(String nom, Category categorie) {
        super();
        this.nom = nom;
        this.categorie = categorie;
    }

    // GETTEURS ET SETTEURS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Category getCategorie() {
        return categorie;
    }

    public void setCategorie(Category categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", categorie=" + categorie +
                '}';
    }
}
