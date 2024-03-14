package com.example.service_produit.service;

import com.example.service_produit.entites.Dto.ProduitDTO;
import com.example.service_produit.entites.Produit;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface ProduitService {
    List<Produit> findAllProduits();

    Optional<Produit> findProduitById(Long id);

    Produit saveProduit(ProduitDTO produit);

    void deleteProduit(Long id);
}
