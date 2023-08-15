package com.mindhubAP.homebankingAP.repositories;

import com.mindhubAP.homebankingAP.models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LoanRepository extends JpaRepository<Loan, Long> {
}
