package com.example.service_produit.entites.mapper;

import com.example.service_produit.entites.Dto.ProduitDTO;
import com.example.service_produit.entites.Produit;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper
public interface ProduitMapper {

    ProduitMapper INSTANCE = Mappers.getMapper( ProduitMapper.class );
    ProduitDTO produitToProduitDto(Produit produit);
    Produit produitDtoToProduit(ProduitDTO produitDTO);
}
