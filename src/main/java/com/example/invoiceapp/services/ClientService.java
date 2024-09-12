package com.example.invoiceapp.services;

import com.example.invoiceapp.models.Client;
import com.example.invoiceapp.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    public Optional<Client> findByID(long id){
        return this.clientRepository.findById(id);
    }


    public List<Client> findAll(){
        return this.clientRepository.findAll();
    }
}
