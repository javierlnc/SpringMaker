package com.application.rest.controller.dto;

import com.application.rest.entities.Product;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class MakerDTO {

    private long id;
    private String name;
    private List<Product> productList = new ArrayList<>();
}
