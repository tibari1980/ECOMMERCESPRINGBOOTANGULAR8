package com.ecommerce.arcesi.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name="PRODUITS")
public class Produit implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeProduit;
    private String nomProduit;
    private String description;
    private boolean selected;
    private boolean disponible;
    private Integer quantiteStock;
    private boolean enPromotion;
    private String nomPhoto;
    private double prixProduit;

    @ManyToOne
    @JoinColumn(name = "codeCategorie")
    private Categorie categorie;

    public Produit(String nomProduit, String description, boolean selected, boolean disponible, Integer quantiteStock, boolean enPromotion, String nomPhoto, Categorie categorie) {
        this.nomProduit = nomProduit;
        this.description = description;
        this.selected = selected;
        this.disponible = disponible;
        this.quantiteStock = quantiteStock;
        this.enPromotion = enPromotion;
        this.nomPhoto = nomPhoto;
        this.categorie = categorie;
    }

    public Produit(String nomProduit, String description, boolean selected, boolean disponible, Integer quantiteStock, boolean enPromotion, String nomPhoto) {
        this.nomProduit = nomProduit;
        this.description = description;
        this.selected = selected;
        this.disponible = disponible;
        this.quantiteStock = quantiteStock;
        this.enPromotion = enPromotion;
        this.nomPhoto = nomPhoto;
    }

    public Produit() {
    }

    public Long getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(Long codeProduit) {
        this.codeProduit = codeProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Integer getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(Integer quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public boolean isEnPromotion() {
        return enPromotion;
    }

    public void setEnPromotion(boolean enPromotion) {
        this.enPromotion = enPromotion;
    }

    public String getNomPhoto() {
        return nomPhoto;
    }

    public void setNomPhoto(String nomPhoto) {
        this.nomPhoto = nomPhoto;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "codeProduit=" + codeProduit +
                ", nomProduit='" + nomProduit + '\'' +
                ", description='" + description + '\'' +
                ", selected=" + selected +
                ", disponible=" + disponible +
                ", quantiteStock=" + quantiteStock +
                ", enPromotion=" + enPromotion +
                ", nomPhoto='" + nomPhoto + '\'' +
                ", categorie=" + categorie +
                '}';
    }

    public double getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(double prixProduit) {
        this.prixProduit = prixProduit;
    }
}
