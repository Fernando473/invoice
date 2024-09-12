package com.example.invoiceapp.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Client {

    @Id
    @GeneratedValue
    private long clientID;

    private String name;

    private String lastName;

    @OneToMany(mappedBy = "client")
    private List<Order> orders;

}
