package fr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ingredient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nom", length = 50, nullable = false, unique = true)
	private String nom;
	@Column(name = "prix", length = 30, nullable = false)
	private Double prix;
	@Column(name = "quantite", length = 30, nullable = false)
	private Long quantite;

	public Ingredient(String nom, Double prix, Long quantite) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.quantite = quantite;
	}

	public Ingredient() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public Long getQuantite() {
		return quantite;
	}

	public void setQuantite(Long quantite) {
		this.quantite = quantite;
	}

}
