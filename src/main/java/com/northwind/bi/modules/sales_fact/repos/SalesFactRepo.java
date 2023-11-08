package com.northwind.bi.modules.sales_fact.repos;

import com.northwind.bi.modules.sales_fact.SalesFactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesFactRepo extends JpaRepository<SalesFactEntity, Integer> {
}
