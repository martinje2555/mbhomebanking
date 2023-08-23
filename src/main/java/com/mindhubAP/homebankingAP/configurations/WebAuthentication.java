package com.mindhubAP.homebankingAP.configurations;


import com.mindhubAP.homebankingAP.models.Client;
import com.mindhubAP.homebankingAP.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@Configuration
public class WebAuthentication extends GlobalAuthenticationConfigurerAdapter {

    @Autowired
    ClientRepository clientRepository;

    @Bean
    public PasswordEncoder passwordEncoder() {return PasswordEncoderFactories.createDelegatingPasswordEncoder();}

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService (inputName -> {

           Client client = clientRepository.findByEMail(inputName);

            if (client != null) {
                return new Client(Client.getEMail(), Client.getPassword(),
                AuthorityUtils.createAuthorityList("CLIENT"));

            } else {
                throw new ClientNameNotFoundException("Unknown user: " + inputName);
            }
        },


    }


