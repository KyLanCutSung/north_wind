package com.northwind.bi.APIs;

import com.northwind.bi.modules.sales_fact.SalesFactEntity;
import com.northwind.bi.modules.sales_fact.dtos.CustomerSalesDTO;
import com.northwind.bi.modules.sales_fact.services.SalesFactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/v1/api/sales-fact")
@RestController
@RequiredArgsConstructor
public class SalesFactAPI {
    private final SalesFactService salesFactService;

    @GetMapping
    public ResponseEntity<List<CustomerSalesDTO>> findAllWithCustomer(){
        List<CustomerSalesDTO> customerSalesDTOS = salesFactService.findAllWithCustomer();
        return new ResponseEntity<>(customerSalesDTOS, HttpStatus.OK);
    }
}
