package com.mindhubAP.homebankingAP.repositories;

import com.mindhubAP.homebankingAP.models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
