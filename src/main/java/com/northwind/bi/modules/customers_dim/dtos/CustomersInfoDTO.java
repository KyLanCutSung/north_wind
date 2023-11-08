package com.northwind.bi.modules.customers_dim.dtos;

import com.northwind.bi.modules.sales_fact.SalesFactEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomersInfoDTO {
    private String companyName;
    private String contactName;
    private String contactTitle;
    private String address;
    private List<SalesFactEntity> salesFactEntities;
}
