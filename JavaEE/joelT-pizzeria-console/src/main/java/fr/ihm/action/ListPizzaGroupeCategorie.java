package fr.ihm.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.ihm.IhmUtil;
import fr.model.CategoriePizza;
import fr.model.Pizza;

@Component
public class ListPizzaGroupeCategorie extends Action {
	@Autowired
	private IhmUtil ihmUtil;

	@PostConstruct
	public void init() {
		this.setDescription("Liste les pizza par groupe categorie");
	}

	@Override
	public void doAction() throws SQLException {
		System.out.println("Affichage des pizzas par categories");
		Map<CategoriePizza, List<Pizza>> map = this.ihmUtil.getPizzaDao().findAll().stream()
				.collect(Collectors.groupingBy(pizza -> pizza.getCatPizza()));
		map.entrySet().stream().forEach(System.out::println);
	}

	@Override
	public void describeAction() {
		System.out.println(this.getDescription());
	}
}
