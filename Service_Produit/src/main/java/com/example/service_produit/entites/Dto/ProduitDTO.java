package com.example.service_produit.entites.Dto;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public class ProduitDTO {
    private Long id;

    @NotBlank(message = "Le nom du produit est requis")
    private String nom;

    @Size(max = 1000, message = "La description du produit ne doit pas dépasser 1000 caractères")
    private String description;

    @NotNull(message = "Le prix unitaire du produit est requis")
    @DecimalMin(value = "0.01", message = "Le prix unitaire du produit doit être supérieur à 0")
    private BigDecimal prixUnitaire;

    @NotNull(message = "La quantité en stock du produit est requise")
    @Min(value = 0, message = "La quantité en stock du produit ne peut pas être négative")
    private Integer quantiteEnStock;

    @NotNull(message = "La disponibilité du produit est requise")
    private Boolean disponible;

    private String marque;

    @NotNull(message = "L'identifiant de la catégorie est requis")
    private Long categorieId;
}
