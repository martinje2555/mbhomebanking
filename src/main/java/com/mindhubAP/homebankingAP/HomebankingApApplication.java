package com.mindhubAP.homebankingAP;

import com.mindhubAP.homebankingAP.models.Client;
import com.mindhubAP.homebankingAP.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class HomebankingApApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomebankingApApplication.class, args);
	}

	@Bean

	public CommandLineRunner initData(ClientRepository clientRepository){
		return args -> {

			Client client1 = new Client ("Melba", "Morel", "melba@mindhub.com");
			Client client2 = new Client("Oscar", "Jaramillo", "ojaramillo@mindhub.com");

			clientRepository.save(client1);
			clientRepository.save(client2);
		};
	}

}
