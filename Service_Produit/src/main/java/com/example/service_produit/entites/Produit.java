package com.example.service_produit.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "produits")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(length = 1000)
    private String description;

    @Column(nullable = false)
    private BigDecimal prixUnitaire;

    @Column(nullable = false)
    private Integer quantiteEnStock;

    @Column(nullable = false)
    private Boolean disponible;

    private String marque;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

}

