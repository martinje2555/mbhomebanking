package com.mindhubAP.homebankingAP;

import com.mindhubAP.homebankingAP.models.Client;
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

	public CommandLineRunner initData(){
		return (args -> ){

			Client client = new Client();
		}
	}

}
