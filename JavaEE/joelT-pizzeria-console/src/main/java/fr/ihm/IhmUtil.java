package fr.ihm;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.dao.PizzaDaoFactory;

@Component
public class IhmUtil {

	@Autowired
	private Scanner scanner;
	@Autowired
	private PizzaDaoFactory pizzaDao;

	public Scanner getScanner() {
		return this.scanner;
	}

	public PizzaDaoFactory getPizzaDao() {
		return this.pizzaDao;
	}

}
