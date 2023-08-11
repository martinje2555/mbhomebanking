package com.mindhubAP.homebankingAP;

import com.mindhubAP.homebankingAP.models.Account;
import com.mindhubAP.homebankingAP.models.Client;
import com.mindhubAP.homebankingAP.models.Transaction;
import com.mindhubAP.homebankingAP.models.TransactionType;
import com.mindhubAP.homebankingAP.repositories.AccountRepository;
import com.mindhubAP.homebankingAP.repositories.ClientRepository;
import com.mindhubAP.homebankingAP.repositories.TransactionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

import static com.mindhubAP.homebankingAP.models.TransactionType.CREDIT;
import static com.mindhubAP.homebankingAP.models.TransactionType.DEBIT;


@SpringBootApplication
public class HomebankingApApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomebankingApApplication.class, args);
	}

	@Bean

	public CommandLineRunner initData(ClientRepository clientRepository, AccountRepository accountRepository, TransactionRepository transactionRepository){
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

		};
	}

}
