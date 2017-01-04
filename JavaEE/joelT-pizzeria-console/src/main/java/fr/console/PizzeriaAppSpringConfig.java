package fr.console;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import fr.dao.PizzaDaoFactory;
import fr.dao.PizzaDaoTableau;

@Configuration
@ComponentScan("fr.ihm")
public class PizzeriaAppSpringConfig {

	@Bean
	public PizzaDaoFactory pizzaDao() {
		PizzaDaoFactory test = new PizzaDaoTableau();
		return test;
	}

	@Bean
	public Scanner scanner() {
		return new Scanner(System.in);
	}

}
