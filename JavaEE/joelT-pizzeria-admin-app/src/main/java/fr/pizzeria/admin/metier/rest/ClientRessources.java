package fr.pizzeria.admin.metier.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.model.CategoriePizza;
import fr.model.Pizza;
import fr.pizzeria.admin.metier.PizzaServiceEJB;

@Path("/pizza")
public class ClientRessources {
	@Inject
	private PizzaServiceEJB pizzaJPA;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Pizza> list() {
		return pizzaJPA.findAllPizza();
	}

	@POST
	@Path("/{code}/{reference}/{prix}/{cat}")
	@Produces(MediaType.APPLICATION_JSON)
	public void createPizza(@PathParam("code") String code, @PathParam("reference") String reference,
			@PathParam("prix") Double prix, @PathParam("cat") String cat) {
		pizzaJPA.save(new Pizza(code, reference, CategoriePizza.valueOf(cat), prix));
	}

	@PUT
	@Path("{id}/{oldCode}/{code}/{reference}/{prix}/{cat}")
	public void updatePizza(@PathParam("id") Integer id, @PathParam("code") String code,
			@PathParam("reference") String reference, @PathParam("prix") Double prix, @PathParam("cat") String cat,
			@PathParam("oldCode") String oldCode) {

		pizzaJPA.update((new Pizza(id, code, reference, CategoriePizza.valueOf(cat), prix)), oldCode);
	}

	@DELETE
	@Path("{code}")
	public void deletePizza(@PathParam("code") String code) {
		pizzaJPA.delete(code);
	}
}
