package fr.pizzeria.admin.metier;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import fr.model.Pizza;

@Stateless
public class PizzaServiceEJB {

	@PersistenceContext(unitName = "joelT-pizzeria-console")
	private EntityManager em;

	public List<Pizza> findAllPizza() {
		TypedQuery<Pizza> empizza = em.createQuery("SELECT p FROM Pizza p", Pizza.class);
		return empizza.getResultList();
	}

	public void save(Pizza newPizza) {
		em.persist(newPizza);
	}

	public Pizza findByCode(String codePizza) {
		return em.createNamedQuery("code.findByCode", Pizza.class).setParameter("name", codePizza).getSingleResult();
	}

	public void delete(String pizzaToDelete) {
		Pizza pem = findByCode(pizzaToDelete);
		if (findByCode(pizzaToDelete).getCode().equals(pizzaToDelete)) {
			em.remove(pem);
		}
	}

}
