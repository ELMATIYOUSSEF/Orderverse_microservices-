package com.example.service_produit.service;

import com.example.service_produit.entites.Categorie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface CategorieService {
    List<Categorie> findAllCategories();

    Optional<Categorie> findCategorieById(Long id);

    Categorie saveCategorie(Categorie categorie);

    void deleteCategorie(Long id);
}
