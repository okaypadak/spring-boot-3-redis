package dev.padak.backend.service;

import dev.padak.backend.dto.ProductDTO;
import dev.padak.backend.entity.ProductEntity;
import dev.padak.backend.mapper.ProductMapper;
import dev.padak.backend.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    @PostConstruct
    public List<ProductDTO> loadProductsFromDB() {

        return productRepository.findAll().stream().map(tek -> ProductMapper.entityToDto(tek)).toList();
    }


}
