package com.store.MyShop.Models;

import jakarta.persistence.*;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Category parent;

    public Category()
    {
        super();
    }
    public Category(String nom, Category parent) {
        super();
        this.nom = nom;
        this.parent = parent;
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

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", parent=" + parent +
                '}';
    }
}
