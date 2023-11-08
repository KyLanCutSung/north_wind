package com.northwind.bi.APIs;

import com.northwind.bi.modules.products_dim.dtos.ProductDimCountSalesDTO;
import com.northwind.bi.modules.products_dim.services.ProductDimService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/v1/api/products-dim")
@RestController
@RequiredArgsConstructor
public class ProductsDimAPI {
    private final ProductDimService productDimService;

    @GetMapping
    public ResponseEntity<List<ProductDimCountSalesDTO>> countProductsSales(){
        return new ResponseEntity<>(productDimService.countProductsSales(), HttpStatus.OK);
    }
}
