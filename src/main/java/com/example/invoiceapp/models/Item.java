package com.example.invoiceapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Item {
    @Id
    @GeneratedValue
    private Long itemID;

    private String itemName;

    private int stock;

    private double price;
}
