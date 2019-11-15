package com.ecommerce.arcesi.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity(name = "CATEGORIES")
public class Categorie  implements Serializable {

         @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
         private Long codeCategorie;
         private String nomCategorie;
         private String descriptionCategorie;
         @OneToMany(mappedBy = "categorie")
         private Collection<Produit> produits;

    public Categorie(String nomCategorie, String descriptionCategorie, Collection<Produit> produits) {
        this.nomCategorie = nomCategorie;
        this.descriptionCategorie = descriptionCategorie;
        this.produits = produits;
    }

    public Categorie(String nomCategorie, String descriptionCategorie) {
        this.nomCategorie = nomCategorie;
        this.descriptionCategorie = descriptionCategorie;
    }

    public Categorie() {
    }

    public Long getCodeCategorie() {
        return codeCategorie;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "codeCategorie=" + codeCategorie +
                ", nomCategorie='" + nomCategorie + '\'' +
                ", descriptionCategorie='" + descriptionCategorie + '\'' +
                '}';
    }

    public void setCodeCategorie(Long codeCategorie) {
        this.codeCategorie = codeCategorie;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public String getDescriptionCategorie() {
        return descriptionCategorie;
    }

    public void setDescriptionCategorie(String descriptionCategorie) {
        this.descriptionCategorie = descriptionCategorie;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }


}
