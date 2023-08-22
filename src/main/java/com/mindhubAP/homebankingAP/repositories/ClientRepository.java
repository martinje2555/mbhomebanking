package com.mindhubAP.homebankingAP.repositories;

import antlr.collections.List;
import com.mindhubAP.homebankingAP.dtos.ClientDTO;
import com.mindhubAP.homebankingAP.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long> {
    List<client> findByEMail(String eMail);

}