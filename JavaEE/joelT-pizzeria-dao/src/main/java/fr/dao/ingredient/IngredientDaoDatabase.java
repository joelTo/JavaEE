package fr.dao.ingredient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.model.Ingredient;

@Repository
public class IngredientDaoDatabase implements IIngredientDaoFactory {
	@Autowired
	private IIngredientRepository database;

	@Override
	public List<Ingredient> findAll() {
		return database.findAll();
	}

	@Override
	public void save(Ingredient newIng) {
		database.save(newIng);

	}

	@Override
	public void delete(Integer numToDelete) {
		database.delete(numToDelete);
	}

	@Override
	public void update(Ingredient update, Integer oldIng) {
		database.delete(oldIng);
		database.save(update);

	}

}
