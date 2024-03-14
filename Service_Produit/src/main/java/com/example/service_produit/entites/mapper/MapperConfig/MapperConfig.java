package com.example.service_produit.entites.mapper.MapperConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.service_produit.entites.mapper.ProduitMapper;

@Configuration
public class MapperConfig {

    @Bean
    public ProduitMapper produitMapper() {
        return ProduitMapper.INSTANCE;
    }
}

