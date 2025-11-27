package com.mishri.ecommerceApp.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product extends BaseEntity{
    String title;
    Double price;
    String category;
}

