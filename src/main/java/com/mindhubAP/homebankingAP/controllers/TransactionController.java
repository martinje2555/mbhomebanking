package com.mindhubAP.homebankingAP.controllers;


import com.mindhubAP.homebankingAP.dtos.TransactionDTO;
import com.mindhubAP.homebankingAP.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class TransactionController {
    @Autowired
    private TransactionRepository transactionRepository;

    @RequestMapping("/transactions")
    public List<TransactionDTO> getAll() {
        return transactionRepository.findAll().stream().map(transaction -> new TransactionDTO(transaction)).collect(Collectors.toList());
    }

    @RequestMapping("/transactions/{id}")
    public TransactionDTO getTransaction(@PathVariable Long id){
        return transactionRepository.findById(id).map(transaction -> new TransactionDTO(transaction)).orElse(null);

    }

}
