package com.application.rest.service;

import com.application.rest.entities.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();
    Optional<Product> findById(Long id);
    void save(Product product);
    List<Product> findByPriceRange(BigDecimal minPrince, BigDecimal maxPrice);
    void  delete(Long id);
}
