package com.omar.prod;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.omar.prod.entities.Produit;
import com.omar.prod.repos.ProduitRepository;

@SpringBootTest
class ProduitApplicationTests {

    @Autowired
    private ProduitRepository produitRepository;
    @Test
    public void testCreateProduit() {
        Produit prod = new Produit("PC Dell",2200.500,new Date());
        produitRepository.save(prod);
    }
    @Test
    public void testListerTousProduits()
    {
        List<Produit> prods = produitRepository.findAll();
        for (Produit p : prods)
        {
            System.out.println(p);
        }
    }

}
