package com.northwind.bi.modules.products_dim;

import com.northwind.bi.modules.sales_fact.SalesFactEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "PRODUCTS_DIM")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDimEntity {
    @Id
    @Column(name = "PRODUCT_SK")
    private Integer productSk;
    @Column(name = "PRODUCTID")
    private Integer productId;
    @Column(name = "VERSION")
    private Integer version;
    @Column(name = "PRODUCTNAME")
    private String productName;
    @Column(name = "CATEGORYNAME")
    private String categoryName;
    @Column(name = "UNITPRICE")
    private Double unitPrice;
    @Column(name = "UNITSINSTOCK")
    private Short unitsInStock;
    @Column(name = "UNITSONORDER")
    private Short unitsOnOrder;
    @Column(name = "DISCONTINUED")
    private Short discontinued;
    @Column(name = "date_from")
    private Date dateFrom;
    @Column(name = "date_to")
    private Date dateTo;

    @OneToMany(mappedBy = "productId")
    private List<SalesFactEntity> salesFactEntities = new ArrayList<>();
}
