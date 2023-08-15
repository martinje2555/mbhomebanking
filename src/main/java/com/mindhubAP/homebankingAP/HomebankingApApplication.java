package com.mindhubAP.homebankingAP;

import com.mindhubAP.homebankingAP.models.*;
import com.mindhubAP.homebankingAP.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

import static com.mindhubAP.homebankingAP.models.TransactionType.CREDIT;
import static com.mindhubAP.homebankingAP.models.TransactionType.DEBIT;


@SpringBootApplication
public class HomebankingApApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomebankingApApplication.class, args);
	}

	@Bean

	public CommandLineRunner initData(ClientRepository clientRepository,
									  AccountRepository accountRepository,
									  TransactionRepository transactionRepository,
									  LoanRepository loanRepository,
									  ClientLoanRepository clientLoanRepository
									  ){
		return args -> {

			Client client1 = new Client ("Melba", "Morel", "melba@mindhub.com");
			Client client2 = new Client("Oscar", "Jaramillo", "ojaramillo@mindhub.com");

			clientRepository.save(client1);
			clientRepository.save(client2);

			Account account1 = new Account("VIM001", LocalDate.now(), 5000);
			client1.addAccount(account1);
			accountRepository.save(account1);

			Account account2 = new Account("VIM002", LocalDate.now().plusDays(1), 7500);
			client1.addAccount(account2);
			accountRepository.save(account2);

			Account account3 =new Account("VIM003", LocalDate.now(), 12000);
			client2.addAccount(account3);
			accountRepository.save(account3);

			Account account4 = new Account("VIM004",LocalDate.now().plusDays(1), 2000);
			client2.addAccount(account4);
			accountRepository.save(account4);

			Transaction transaction1 = new Transaction(CREDIT, 5000, LocalDate.now(),"Transference");
			account1.addTransaction(transaction1);
			transactionRepository.save(transaction1);

			Transaction transaction2 = new Transaction(DEBIT, -2500 ,LocalDate.now(), "Maintenance Cost");
			account1.addTransaction(transaction2);
			transactionRepository.save(transaction2);

			Transaction transaction3 = new Transaction(DEBIT, -2500, LocalDate.now(), "Maintenance cost");
			account2.addTransaction(transaction3);
			transactionRepository.save(transaction3);

			Transaction transaction4 = new Transaction(CREDIT, 322875.60, LocalDate.now(), "Salary credit");
			account2.addTransaction(transaction4);
			transactionRepository.save(transaction4);

			Transaction transaction5 = new Transaction(CREDIT, 120000, LocalDate.now(), "Salary credit");
			account3.addTransaction(transaction5);
			transactionRepository.save(transaction5);

			Transaction transaction6 = new Transaction(DEBIT, -20574.6,LocalDate.now(), "Service payment");
			account3.addTransaction(transaction6);
			transactionRepository.save(transaction6);

			Transaction transaction7 = new Transaction(DEBIT, -20000,LocalDate.now(), "Service payment");
			account4.addTransaction(transaction7);
			transactionRepository.save(transaction7);

			Transaction transaction8 = new Transaction(CREDIT, 410288.50,LocalDate.now(), "Service pay");
			account4.addTransaction(transaction8);
			transactionRepository.save(transaction8);

			Loan loan1 = new Loan("mortgage", 500000, List.of(12,24,36,48,60));
			Loan loan2 = new Loan("personal", 100000, List.of(6, 12, 24));
			Loan loan3 = new Loan("automotive", 300000, List.of(6, 12, 24, 36));
			loanRepository.save(loan1);
			loanRepository.save(loan2);
			loanRepository.save(loan3);

			ClientLoan clientLoan1 = new ClientLoan(400000,60);
			client1.addClientLoan(clientLoan1);
			clientLoanRepository.save(clientLoan1);

			ClientLoan clientLoan2 = new ClientLoan(50000,12);
			client1.addClientLoan(clientLoan2);
			clientLoanRepository.save(clientLoan2);

			ClientLoan clientLoan3 = new ClientLoan(100000,24);
			client2.addClientLoan(clientLoan3);
			clientLoanRepository.save(clientLoan3);

			ClientLoan clientLoan4 = new ClientLoan(200000,36);
			client2.addClientLoan(clientLoan4);
			clientLoanRepository.save(clientLoan4);



		};
	}

}
