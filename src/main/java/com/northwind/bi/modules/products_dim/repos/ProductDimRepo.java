package com.northwind.bi.modules.products_dim.repos;

import com.northwind.bi.modules.products_dim.ProductDimEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDimRepo extends JpaRepository<ProductDimEntity, Integer> {
}
