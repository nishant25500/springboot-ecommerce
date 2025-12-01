package com.mishri.ecommerceApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category extends BaseEntity{

    private String name;

    //this doesn't mean that we are trying to store a list of products inside category table
    //Telling JPA, the relationship is already owned by the product entity. So, just read from there.
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
