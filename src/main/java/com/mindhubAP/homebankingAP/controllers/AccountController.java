package com.mindhubAP.homebankingAP.controllers;


import com.mindhubAP.homebankingAP.dtos.AccountDTO;
import com.mindhubAP.homebankingAP.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @RequestMapping("/accounts")
    public List<AccountDTO> getAll() {
        return accountRepository.findAll().stream().map(AccountDTO::new).collect(Collectors.toList());
    }

    @RequestMapping("/Accounts/{id]")
    public AccountDTO getAccount (@PathVariable Long id){
        return accountRepository.findById(id).map(account -> new AccountDTO(account)).orElse(null);
    }

}
