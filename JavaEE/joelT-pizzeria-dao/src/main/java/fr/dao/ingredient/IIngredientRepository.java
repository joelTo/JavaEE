package fr.dao.ingredient;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.model.Ingredient;

public interface IIngredientRepository extends JpaRepository<Ingredient, Integer> {

}
