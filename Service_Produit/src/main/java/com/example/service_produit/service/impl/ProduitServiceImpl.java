package com.example.service_produit.service.impl;

import com.example.service_produit.entites.Dto.ProduitDTO;
import com.example.service_produit.entites.Produit;
import com.example.service_produit.entites.mapper.ProduitMapper;
import com.example.service_produit.repository.ProduitRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitServiceImpl implements com.example.service_produit.service.ProduitService {

    private final ProduitRepository produitRepository;
    private final ProduitMapper produitMapper;

    public ProduitServiceImpl(ProduitRepository produitRepository, ProduitMapper produitMapper) {
        this.produitRepository = produitRepository;
        this.produitMapper = produitMapper;
    }

    @Override
    public List<Produit> findAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Optional<Produit> findProduitById(Long id) {
        return produitRepository.findById(id);
    }

    @Override
    public Produit saveProduit(ProduitDTO produit) {
        return produitRepository.save(produitMapper.produitDtoToProduit(produit));
    }

    @Override
    public void deleteProduit(Long id) {
        produitRepository.deleteById(id);
    }

}

