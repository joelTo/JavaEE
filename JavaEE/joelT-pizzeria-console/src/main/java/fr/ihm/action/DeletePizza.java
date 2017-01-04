package fr.ihm.action;

import java.sql.SQLException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.exception.DeletePizzaException;
import fr.ihm.IhmUtil;

@Component
public class DeletePizza extends Action {
	@Autowired
	private IhmUtil ihmUtil;

	@PostConstruct
	public void init() {
		this.setDescription("Supprimer une pizza");
	}

	@Override
	public void doAction() throws DeletePizzaException, SQLException {
		System.out.println("");
		System.out.println("Veuillez entrerle code <Alias de pizza a supprimer, s'il vous plait");
		String pizzaToDelete = ihmUtil.getScanner().next();
		ihmUtil.getPizzaDao().delete(pizzaToDelete);
	}

	@Override
	public void describeAction() {
		System.out.println(this.getDescription());
	}

}
