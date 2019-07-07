package entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import util.StatutCommande;

@Entity
public class Commande {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "dateHeure")
	private LocalDateTime dateHeure;

	@Enumerated
	private StatutCommande statut;

	public Commande() {

		this.dateHeure = LocalDateTime.now();
		this.statut = StatutCommande.EN_ATTENTE;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDateHeure() {
		return dateHeure;
	}

	public void setDateHeure(LocalDateTime dateHeure) {
		this.dateHeure = dateHeure;
	}

	public StatutCommande getStatut() {
		return statut;
	}

	public void setStatut(StatutCommande statut) {
		this.statut = statut;
	}

}
