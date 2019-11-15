package com.ecommerce.arcesi.dao;

import com.ecommerce.arcesi.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit,Long> {
    //http://localhost:8080/produits/search/produitsEnPromotion
    @RestResource(path = "/produitsEnPromotion")
    public List<Produit> findByEnPromotionIsTrue();
    //http://localhost:8080/produits/search/produitsSelectionner
    @RestResource(path = "/produitsSelectionner")
    public List<Produit> findBySelectedIsTrue();

    //http://localhost:8080/produits/search/produitParMotCle?mc=I
    @RestResource(path = "/produitParMotCle")
    public List<Produit> findByNomProduitContains(@Param("mc") String mc);

    //http://localhost:8080/produits/search/produitDisponible
    @RestResource(path = "/produitDisponible")
    public List<Produit> findByDisponibleIsTrue();


}
