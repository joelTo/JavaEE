package fr.ihm.action;

import java.sql.SQLException;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.ihm.IhmUtil;

@Component
public class ListPizza extends Action {
	@Autowired
	private IhmUtil ihmUtil;

	@PostConstruct
	public void init() {
		this.setDescription("Lister les pizzas");
	}

	@Override
	public void doAction() throws SQLException {
		System.out.println("*****************");
		System.out.println("LISTE DES PIZZAS ");
		System.out.println("*****************");

		Stream.of(this.ihmUtil.getPizzaDao().findAll()).forEach(System.out::println);
		System.out.println(
				"*******************************************************************************************************");
	}

	@Override
	public void describeAction() {
		System.out.println(this.getDescription());
	}

}
