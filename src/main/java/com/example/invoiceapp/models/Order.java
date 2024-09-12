package com.example.invoiceapp.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "purchase_order")
public class Order {
    @Id
    @GeneratedValue
    private long orderID;
    private Date date;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;
}

