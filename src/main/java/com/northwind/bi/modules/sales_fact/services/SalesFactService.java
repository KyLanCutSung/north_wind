package com.northwind.bi.modules.sales_fact.services;

import com.northwind.bi.modules.sales_fact.SalesFactEntity;
import com.northwind.bi.modules.sales_fact.dtos.CustomerSalesDTO;
import com.northwind.bi.modules.sales_fact.repos.SalesFactRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SalesFactService {
    private final SalesFactRepo salesFactRepo;

    public List<CustomerSalesDTO> findAllWithCustomer(){
        List<SalesFactEntity> salesFactEntities = salesFactRepo.findAll();
        List<CustomerSalesDTO> customerSalesDTOS = new ArrayList<>();
        salesFactEntities.forEach(salesFactEntity -> {
            CustomerSalesDTO customerSalesDTO = new CustomerSalesDTO();
            BeanUtils.copyProperties(salesFactEntity, customerSalesDTO);
            customerSalesDTOS.add(customerSalesDTO);
        });
        return customerSalesDTOS;
    }


}
