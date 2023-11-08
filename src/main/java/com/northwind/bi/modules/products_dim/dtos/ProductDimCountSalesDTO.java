package com.northwind.bi.modules.products_dim.dtos;

import lombok.Data;

@Data
public class ProductDimCountSalesDTO {
    private Integer productId;
    private String productName;
    private Integer countSales;
}
