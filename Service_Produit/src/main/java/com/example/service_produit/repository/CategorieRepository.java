package com.example.service_produit.repository;

import com.example.service_produit.entites.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
