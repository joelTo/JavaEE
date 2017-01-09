package fr.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.model.Performance;

@Repository
public class PerformanceDaoDatabaseH2 implements IPerformanceDaoFactory {

	@Autowired
	private IPerformanceRepository perform;

	@Override
	public List<Performance> findAll() {
		return perform.findAll();
	}

	@Override
	public void save(Performance newPerformance) {
		perform.save(newPerformance);
	}

	@Override
	public void delete(Integer performanceToDelete) {
		perform.delete(performanceToDelete);

	}

}
