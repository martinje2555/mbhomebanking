package com.mindhubAP.homebankingAP.repositories;

import com.mindhubAP.homebankingAP.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction Long> {

        }
