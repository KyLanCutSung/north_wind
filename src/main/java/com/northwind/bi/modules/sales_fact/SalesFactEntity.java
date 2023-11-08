package com.northwind.bi.modules.sales_fact;

import com.northwind.bi.modules.customers_dim.CustomersDimEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SALES_FACT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesFactEntity{
    @Id
    private Integer salesSk;
    @Column(name = "LOCATION_ID")
    private Integer locationId;
    @Column(name = "DATE_ID")
    private Integer dateId;
    @Column(name = "CUSTOMER_ID")
    private Integer customerId;
    @Column(name = "PRODUCT_ID")
    private Integer productId;
    @Column(name = "REVENUE")
    private Long revenue;
    @Column(name = "QUANTITY")
    private Integer quantity;
//    @ManyToOne
//    @JoinColumn(name = "CUSTOMER_ID")
//    private CustomersDimEntity customersDimEntity;
}
