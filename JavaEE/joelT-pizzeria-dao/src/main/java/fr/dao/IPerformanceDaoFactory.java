package fr.dao;

import java.util.List;

import fr.model.Performance;

public interface IPerformanceDaoFactory {

	List<Performance> findAll();

	void save(Performance newPerformance);

	void delete(Integer performanceToDelete);

}
