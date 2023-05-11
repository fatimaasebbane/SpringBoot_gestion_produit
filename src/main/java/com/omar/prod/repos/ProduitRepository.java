package com.omar.prod.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.omar.prod.entities.Produit;
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}

