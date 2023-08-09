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

		};
	}

}
