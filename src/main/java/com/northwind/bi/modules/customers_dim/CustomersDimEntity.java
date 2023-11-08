package com.northwind.bi.modules.customers_dim;

import com.northwind.bi.modules.sales_fact.SalesFactEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CUSTOMERS_DIM")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomersDimEntity {
    @Id
    @Column(name = "CUSTOMER_SK")
    private Integer customerSk;
    @Column(name = "VERSION")
    private Integer version;
    @Column(name = "DATE_FROM")
    private Date dateFrom;
    @Column(name = "DATE_TO")
    private Date dateTo;
    @Column(name = "CUSTOMERID")
    private String customerID;
    @Column(name = "COMPANY_NAME")
    private String companyName;
    @Column(name = "CONTACT_NAME")
    private String contactName;
    @Column(name = "CONTACT_TITLE")
    private String contactTitle;
    @Column(name = "ADDRESS")
    private String address;
    @OneToMany(mappedBy = "customerId", fetch = FetchType.LAZY)
    private List<SalesFactEntity> salesFactEntities = new ArrayList<>();
}
