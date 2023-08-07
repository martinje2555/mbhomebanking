package com.mindhubAP.homebankingAP.repositories;


import com.mindhubAP.homebankingAP.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface AccountRepository extends JpaRepository<Account, Id>{
}
