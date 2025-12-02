package com.mishri.ecommerceApp.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product extends BaseEntity{
    @Column(nullable = false)
    private String title;
    @Column
    private String image;
    @Column
    private String color;
    @Column
    private Double price;
    @Column
    private String description;
    @Column
    private Integer discount;
    @Column
    private String model;
    @Column
    private String brand;
    @Column
    private Boolean popular;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="category_id", nullable = false)
    private Category category;  //CategoryController is the return type of the column category_id
}

