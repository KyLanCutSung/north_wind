package com.northwind.bi.modules.products_dim.services;

import com.northwind.bi.modules.products_dim.ProductDimEntity;
import com.northwind.bi.modules.products_dim.dtos.ProductDimCountSalesDTO;
import com.northwind.bi.modules.products_dim.repos.ProductDimRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductDimService {
    private final ProductDimRepo productDimRepo;

    public List<ProductDimCountSalesDTO> countProductsSales() {
        List<ProductDimEntity> productDimEntities = productDimRepo.findAll();
        List<ProductDimCountSalesDTO> productDimCountSalesDTOS = new ArrayList<>();
        productDimEntities.forEach(productDimEntity -> {
            ProductDimCountSalesDTO productDimCountSalesDTO = new ProductDimCountSalesDTO();
            productDimCountSalesDTO.setCountSales(productDimEntity.getSalesFactEntities().size());
            BeanUtils.copyProperties(productDimEntity, productDimCountSalesDTO);
            productDimCountSalesDTOS.add(productDimCountSalesDTO);
        });
        return productDimCountSalesDTOS;
    }
}
