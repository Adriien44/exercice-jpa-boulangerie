package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chocolatine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nom")
	private String nom;

	@Column(name = "temperature")
	private Float temperature;

	@Column(name = "poids")
	private Float poids;

	@Column(name = "prix")
	private Integer prix;

	public Chocolatine() {

	}

	public Chocolatine(String nom, Float temperature, Float poids, Integer prix) {
		super();
		this.nom = nom;
		this.temperature = temperature;
		this.poids = poids;
		this.prix = prix;
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

	public Float getTemperature() {
		return temperature;
	}

	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}

	public Float getPoids() {
		return poids;
	}

	public void setPoids(Float poids) {
		this.poids = poids;
	}

	public Integer getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Chocolatine [id = ");
		builder.append(id);
		builder.append(", ");
		builder.append(nom);
		builder.append(", temperature = ");
		builder.append(temperature);
		builder.append(", poids = ");
		builder.append(poids);
		builder.append(", prix = ");
		builder.append(prix + "€");
		builder.append("]");
		return builder.toString();
	}

}
