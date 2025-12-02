package com.mishri.ecommerceApp.repository;

import com.mishri.ecommerceApp.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

    Category findByName(String name);
}
