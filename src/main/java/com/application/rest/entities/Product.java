package com.application.rest.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
@Data
@Entity
@Table(name= "producto")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="nombre")
    private String name;
    @Column(name = "precio")
    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name="id_fabricante",nullable = false)
    @JsonIgnore
    private Maker maker;
}
