package com.northwind.bi.modules.customers_dim.repos;

import com.northwind.bi.modules.customers_dim.CustomersDimEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomersDimRepo extends JpaRepository<CustomersDimEntity, Integer> {
    List<CustomersDimEntity> findByCompanyName(String companyName);
}
