package com.ecommerce.arcesi;

import com.ecommerce.arcesi.dao.CategoryRepository;
import com.ecommerce.arcesi.dao.ProduitRepository;
import com.ecommerce.arcesi.entities.Categorie;
import com.ecommerce.arcesi.entities.Produit;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class ArcesiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ArcesiApplication.class, args);
    }
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    ProduitRepository produitRepository;
    @Override
    public void run(String... args) throws Exception {
        Categorie cat1=new Categorie("IMPRIMANTE","Tous les Imprimantes tous les marques avec un prix top" );
        Categorie cat2=new Categorie("TELEPHONE","tous le marque de smartephone");
        Categorie cat3=new Categorie("FILM","Ensemblre des films horreur ,fontasme,commedie");
        Categorie cat4=new Categorie("ORDINATEUR","TOUS LES MARQUE DES ORDINATEUR");
        categoryRepository.save(cat1);
        categoryRepository.save(cat2);
        categoryRepository.save(cat3);
        categoryRepository.save(cat4);
        categoryRepository.findAll().forEach(c->{

            for(int i=1;i<20;i++){
                Produit p=new Produit();
                if(c.getNomCategorie().equalsIgnoreCase("IMPRIMANTE")){
                    p.setNomProduit("IMPRIMANTE"+i);
                    p.setDescription(c.getNomCategorie()+"description");
                    p.setNomPhoto(RandomString.make(10));
                    p.setDisponible(new Random().nextBoolean());
                    p.setEnPromotion(new Random().nextBoolean());
                    p.setSelected(new Random().nextBoolean());
                    p.setQuantiteStock(new Random().nextInt()*50);
                    p.setCategorie(c);
                    produitRepository.save(p);
                }else if(c.getNomCategorie().equalsIgnoreCase("FILM")){
                    p.setNomProduit("FILM"+i);
                    p.setDescription(c.getNomCategorie()+"description");
                    p.setNomPhoto(RandomString.make(10));
                    p.setDisponible(new Random().nextBoolean());
                    p.setEnPromotion(new Random().nextBoolean());
                    p.setSelected(new Random().nextBoolean());
                    p.setQuantiteStock(new Random().nextInt()*50);
                    p.setCategorie(c);
                    produitRepository.save(p);
                }else if (c.getNomCategorie().equalsIgnoreCase("ORDINATEUR")){
                    p.setNomProduit("ORDINATEUR"+i);
                    p.setDescription(c.getNomCategorie()+"description");
                    p.setNomPhoto(RandomString.make(10));
                    p.setDisponible(new Random().nextBoolean());
                    p.setEnPromotion(new Random().nextBoolean());
                    p.setSelected(new Random().nextBoolean());
                    p.setQuantiteStock(new Random().nextInt()*50);
                    p.setCategorie(c);
                    produitRepository.save(p);
                }else if(c.getNomCategorie().equalsIgnoreCase("TELEPHONE")){
                     p.setDescription(c.getNomCategorie()+"description");
                    p.setNomPhoto("imprimante"+i);
                    p.setDisponible(new Random().nextBoolean());
                    p.setEnPromotion(new Random().nextBoolean());
                    p.setSelected(new Random().nextBoolean());
                    p.setQuantiteStock(new Random().nextInt()*50);
                    p.setCategorie(c);
                    produitRepository.save(p);
                }


            }
        });
    }
}
