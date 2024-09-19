package com.example.invoiceapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class OrderDetail {
    @Id
    @GeneratedValue
    private long orderDetailID;

    private int quantity;

    @ManyToOne
    private Item item;

    @ManyToOne
    private Order order;

}
