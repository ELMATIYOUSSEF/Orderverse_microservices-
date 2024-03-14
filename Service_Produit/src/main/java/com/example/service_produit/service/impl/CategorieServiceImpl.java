package com.example.service_produit.service.impl;
import com.example.service_produit.entites.Categorie;
import com.example.service_produit.repository.CategorieRepository;
import com.example.service_produit.service.CategorieService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CategorieServiceImpl implements CategorieService {

    private final CategorieRepository categorieRepository;

    public CategorieServiceImpl(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    @Override
    public List<Categorie> findAllCategories() {
        return categorieRepository.findAll();
    }

    @Override
    public Optional<Categorie> findCategorieById(Long id) {
        return categorieRepository.findById(id);
    }

    @Override
    public Categorie saveCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public void deleteCategorie(Long id) {
        categorieRepository.deleteById(id);
    }

}
