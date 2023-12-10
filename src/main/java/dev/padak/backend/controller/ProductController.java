package dev.padak.backend.controller;


import dev.padak.backend.dto.ProductDTO;
import dev.padak.backend.entity.ProductEntity;
import dev.padak.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
 
    @Autowired
    private ProductService service;

    @GetMapping("/all")
    @Cacheable(value = "product", sync = true)
    public List<ProductDTO> getAllTheProducts() throws InterruptedException {

        Thread.sleep(5000);

        return service.loadProductsFromDB();
    }

    @GetMapping("/{id}")
    public ProductDTO getProductById(@PathVariable int id) {
        return null;
    }

}
