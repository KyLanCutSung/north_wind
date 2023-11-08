package com.northwind.bi.modules.customers_dim.services;

import com.northwind.bi.modules.customers_dim.CustomersDimEntity;
import com.northwind.bi.modules.customers_dim.dtos.CustomersInfoDTO;
import com.northwind.bi.modules.customers_dim.repos.CustomersDimRepo;
import com.zaxxer.hikari.util.FastList;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomersDimService {
    private final CustomersDimRepo customersDimRepo;

    public List<CustomersDimEntity> findAll() {
        return customersDimRepo.findAll();
    }

    public List<CustomersInfoDTO> findAllInfo() {
        List<CustomersDimEntity> customersDimEntities = findAll();
        List<CustomersInfoDTO> customersInfoDTOS = new ArrayList<>();
        customersDimEntities.forEach(customersDimEntity -> {
            CustomersInfoDTO customersInfoDTO = new CustomersInfoDTO();
            BeanUtils.copyProperties(customersDimEntity, customersInfoDTO);
            customersInfoDTOS.add(customersInfoDTO);
        });
        return customersInfoDTOS;
    }

    public List<CustomersInfoDTO> findByCompanyName(String companyName) {
        List<CustomersDimEntity> customersDimEntities = customersDimRepo.findByCompanyName(companyName);
        List<CustomersInfoDTO> customersInfoDTOS = new LinkedList<>();
        customersDimEntities.forEach(customersDimEntity -> {
            CustomersInfoDTO customersInfoDTO = new CustomersInfoDTO();
            BeanUtils.copyProperties(customersDimEntity, customersInfoDTO);
            customersInfoDTOS.add(customersInfoDTO);
        });
        return customersInfoDTOS;
    }
}
