package fr.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.model.Performance;

public interface IPerformanceRepository extends JpaRepository<Performance, Integer> {

}
