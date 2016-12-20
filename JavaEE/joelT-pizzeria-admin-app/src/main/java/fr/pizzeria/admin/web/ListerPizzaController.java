package fr.pizzeria.admin.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.dao.PizzaDaoBaseJPA;
import fr.model.Pizza;

public class ListerPizzaController extends HttpServlet {
	private PizzaDaoBaseJPA pizzaBaseJPA = new PizzaDaoBaseJPA();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = this.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/pizzas/listpizzas.jsp");
		List<Pizza> pizzas = null;
		try {
			pizzas = pizzaBaseJPA.findAll();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		req.setAttribute("listPizza", pizzas);
		dispatcher.forward(req, resp);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
