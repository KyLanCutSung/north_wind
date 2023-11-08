package com.northwind.bi.APIs;

import com.northwind.bi.modules.customers_dim.CustomersDimEntity;
import com.northwind.bi.modules.customers_dim.dtos.CustomersInfoDTO;
import com.northwind.bi.modules.customers_dim.services.CustomersDimService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/api/customers-dim")
@RestController
@RequiredArgsConstructor
public class CustomersDimAPI {
    private final CustomersDimService customersDimService;

    @GetMapping
    public ResponseEntity<List<CustomersDimEntity>> findAll(){
        List<CustomersDimEntity> customersDimEntities = customersDimService.findAll();
        return new ResponseEntity<>(customersDimEntities, HttpStatus.OK);
    }

    @GetMapping("/info")
    public ResponseEntity<List<CustomersInfoDTO>> findInfo(){
        List<CustomersInfoDTO> customersInfoDTOS = customersDimService.findAllInfo();
        return new ResponseEntity<>(customersInfoDTOS, HttpStatus.OK);
    }

    @GetMapping("/{companyName}")
    public ResponseEntity<List<CustomersInfoDTO>> findByCompanyName(@PathVariable String companyName){
        List<CustomersInfoDTO> customersInfoDTOS = customersDimService.findByCompanyName(companyName);
        return new ResponseEntity<>(customersInfoDTOS, HttpStatus.OK);
    }
}
