package com.application.rest.persistence.IMPL;

import com.application.rest.entities.Maker;
import com.application.rest.entities.Product;
import com.application.rest.persistence.IProductDAO;
import com.application.rest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
@Component
public class ProductDAOIMPL implements IProductDAO {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);

    }

    @Override
    public List<Product> findByPriceRange(BigDecimal minPrince, BigDecimal maxPrice) {
        return productRepository.findByPriceInRange(minPrince,maxPrice);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);

    }
}
