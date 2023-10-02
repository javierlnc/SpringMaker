package com.application.rest.service.impl;

import com.application.rest.entities.Product;
import com.application.rest.persistence.IProductDAO;
import com.application.rest.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceimpl implements IProductService {
    @Autowired
    private IProductDAO productDAO;
    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productDAO.findById(id);
    }

    @Override
    public void save(Product product) {
        productDAO.save(product);

    }

    @Override
    public List<Product> findByPriceRange(BigDecimal minPrince, BigDecimal maxPrice) {
        return productDAO.findByPriceRange(minPrince,maxPrice);
    }

    @Override
    public void delete(Long id) {
        productDAO.delete(id);
    }
}
