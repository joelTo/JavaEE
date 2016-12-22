package fr.pizzeria.admin.metier;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import fr.model.Pizza;

@Stateless
public class PizzaServiceEJB {

	@PersistenceContext(unitName = "pizzadb")
	private EntityManager em;

	public List<Pizza> findAllPizza() {
		TypedQuery<Pizza> empizza = em.createQuery("SELECT p FROM Pizza p", Pizza.class);
		return empizza.getResultList();
	}
}
