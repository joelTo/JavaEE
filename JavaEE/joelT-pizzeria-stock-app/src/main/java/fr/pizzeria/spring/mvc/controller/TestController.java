package fr.pizzeria.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.model.Ingredient;

@Controller
public class TestController {
	@Autowired
	IngredientDaoDatabase ingredientDao;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView printWelcome() {
		ModelAndView mav = new ModelAndView();
		List<Ingredient> people = ingredientDao.getPeople();
		mav.addObject("people", people);
		mav.setViewName("list");
		return mav;
	}
}
