package com.mindhubAP.homebankingAP.controllers;


import com.mindhubAP.homebankingAP.models.Client;
import com.mindhubAP.homebankingAP.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/API")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @RequestMapping("/clients")
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

}
