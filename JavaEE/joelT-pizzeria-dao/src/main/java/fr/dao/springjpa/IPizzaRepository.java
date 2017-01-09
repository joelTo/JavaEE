package fr.dao.springjpa;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.model.Pizza;

public interface IPizzaRepository extends JpaRepository<Pizza, Integer> {

}
