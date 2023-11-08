package com.northwind.bi.modules.sales_fact.dtos;

import com.northwind.bi.modules.customers_dim.CustomersDimEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerSalesDTO {
    private Integer salesSk;
    private CustomersDimEntity customersDimEntity;
}
