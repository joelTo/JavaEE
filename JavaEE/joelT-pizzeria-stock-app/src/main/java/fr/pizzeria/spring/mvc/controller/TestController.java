package fr.pizzeria.spring.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.dao.ingredient.IngredientResource;
import fr.model.Ingredient;

@Controller
public class TestController {
	@Autowired
	IngredientResource ingredientDao;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView printWelcome() {
		ModelAndView mav = new ModelAndView();
		List<Ingredient> listIngre = ingredientDao.findAll();
		mav.addObject("ingredient", listIngre);
		mav.setViewName("hello");
		return mav;
	}
}
