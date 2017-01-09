package fr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Performance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "service", length = 50, nullable = false, unique = true)
	private String service;
	@Column(name = "date", length = 100, nullable = false)
	private String date;
	@Column(name = "temps", length = 50, nullable = false)
	private Long tempsExecution;

	public Performance() {
		super();
	}

	public Performance(String service, String date, Long tempsExecution) {
		super();
		this.service = service;
		this.date = date;
		this.tempsExecution = tempsExecution;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Long getTempsExecution() {
		return tempsExecution;
	}

	public void setTempsExecution(Long tempsExecution) {
		this.tempsExecution = tempsExecution;
	}

	@Override
	public String toString() {
		return "Performance [id=" + id + ", service=" + service + ", date=" + date + ", temps d'execution="
				+ tempsExecution + " ms" + "]\n";
	}
}
