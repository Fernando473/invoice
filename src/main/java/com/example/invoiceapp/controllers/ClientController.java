package com.example.invoiceapp.controllers;

import com.example.invoiceapp.models.Client;
import com.example.invoiceapp.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> findAll() {
        return this.clientService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Client> findById(@PathVariable Long id) {
        return this.clientService.findByID(id);
    }
}
