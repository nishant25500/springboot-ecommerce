package com.mishri.ecommerceApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    @ManyToOne
    @JoinColumn(name="category_id", nullable = false)
    private Category category;  //Category is the return type of the column category_id
}

