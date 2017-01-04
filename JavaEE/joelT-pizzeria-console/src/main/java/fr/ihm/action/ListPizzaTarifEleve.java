package fr.ihm.action;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.ihm.IhmUtil;
import fr.model.Pizza;

@Component
public class ListPizzaTarifEleve extends Action {
	@Autowired
	private IhmUtil ihmUtil;

	@PostConstruct
	public void init() {
		this.setDescription("Liste la Pizza au Tarif le plus eleve");

	}

	@Override
	public void doAction() throws SQLException {
		System.out.println("je liste le prix le plus élevé par moins élevé");
		this.ihmUtil.getPizzaDao().findAll().stream().collect(Collectors.groupingBy(Pizza::getPrix));
		Optional<Pizza> max = this.ihmUtil.getPizzaDao().findAll().stream().max(Comparator.comparing(Pizza::getPrix));
		System.out.println(max.get());

	}

	public void describeAction() {
		System.out.println(this.getDescription());
	}

}
