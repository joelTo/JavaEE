package fr.model;

import java.text.DateFormat;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Performance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "service", length = 50, nullable = false, unique = true)
	private String service;
	@Column(name = "date", length = 100, nullable = false)
	private DateFormat date;
	@Column(name = "temps", length = 50, nullable = false)
	private Double tempsExecution;

}
