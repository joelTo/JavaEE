package fr.pizzeria.admin.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.dao.PizzaDaoBaseJPA;
import fr.model.Pizza;

public class EditPizzaController extends HttpServlet {
	private PizzaDaoBaseJPA pizzaBaseJPA = new PizzaDaoBaseJPA();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		RequestDispatcher dispatcher = this.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/pizzas/editpizza.jsp");
		// recuperer la pizza avec le code suivant:

		req.setAttribute("PizzaBaseJPA", pizzaBaseJPA);
		Pizza p = new Pizza();
		req.setAttribute("PizzaAModifie", p);
		dispatcher.forward(req, resp);

	}

}
