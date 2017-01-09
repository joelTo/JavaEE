package fr.dao.ingredient;

import java.util.List;

import fr.model.Ingredient;

public interface IIngredientDaoFactory {

	List<Ingredient> findAll();

	void save(Ingredient newIng);

	void delete(Integer ingToDelete);

	void update(Ingredient update, Integer oldIng);

}
