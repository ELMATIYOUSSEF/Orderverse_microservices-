package com.example.service_produit.web;

import com.example.service_produit.entites.Dto.ProduitDTO;
import com.example.service_produit.entites.Produit;
import com.example.service_produit.entites.mapper.ProduitMapper;
import com.example.service_produit.service.ProduitService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/fishes")
public class ControllerProduit {
    private  ProduitService produitService;
    @Autowired
    public ControllerProduit(ProduitService produitService) {
        this.produitService = produitService;
    }
    @GetMapping
    public List<Produit> getAllProduit() {
        return produitService.findAllProduits();
    }
    @PostMapping
    public ResponseEntity<?> createProduit(@RequestBody @Validated ProduitDTO produitDto ) {
        Produit save = produitService.saveProduit(produitDto);
        return ResponseEntity.ok(ResponseEntity.status(200));
    }
}


