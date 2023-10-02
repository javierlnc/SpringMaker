package com.application.rest.persistence;

import com.application.rest.entities.Maker;
import com.application.rest.entities.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IProductDAO {
    List<Product> findAll();
    Optional<Product> findById(Long id);
    void save(Product product);
    List<Product> findByPriceRange(BigDecimal minPrince, BigDecimal maxPrice);
    void  delete(Long id);
}
