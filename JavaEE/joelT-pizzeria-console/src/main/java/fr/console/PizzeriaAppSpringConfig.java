package fr.console;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.dao.PizzaDaoFactory;
import fr.dao.PizzaDaoTableau;
import fr.ihm.IhmUtil;

@Configuration
public class PizzeriaAppSpringConfig {

	@Bean
	public PizzaDaoFactory pizzaDao() {
		PizzaDaoFactory test = new PizzaDaoTableau();
		return test;
	}

	@Bean
	public IhmUtil ihmUtil() {
		IhmUtil ihmUtil = new IhmUtil(new Scanner(System.in), new PizzaDaoTableau());
		return ihmUtil;
	}

}
