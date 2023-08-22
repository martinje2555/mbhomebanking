package com.mindhubAP.homebankingAP.configurations;


import com.mindhubAP.homebankingAP.models.Client;
import com.mindhubAP.homebankingAP.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;

import java.util.List;

@Configuration
public class WebAuthentication extends GlobalAuthenticationConfigurerAdapter {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(inputName -> {
            List<Client> = clientRepository.findByEMail(inputName);
            if (client != null) {
                return new Client(client.getEMail(), client.getPassword(),
                AuthorityUtils.createAuthorityList("CLIENT"));

            } else {
                throw new ClientNameNotFoundException("Unknown user: " + inputName);
            }
        });
    }}
