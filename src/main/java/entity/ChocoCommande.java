package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ChocoCommande {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "commande_id")
	private Commande commande;

	@ManyToOne
	@JoinColumn(name = "chocolatine_id")
	private Chocolatine chocolatine;

	@Column(name = "quantite")
	private int quantite;

	@Column(name = "prixCommande")
	private int prixCommande;

	public ChocoCommande(int quantite, int prixCommande) {
		super();
		this.quantite = quantite;
		this.prixCommande = prixCommande;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Chocolatine getChocolatine() {
		return chocolatine;
	}

	public void setChocolatine(Chocolatine chocolatine) {
		this.chocolatine = chocolatine;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getPrixCommande() {
		return prixCommande;
	}

	public void setPrixCommande(int prixCommande) {
		this.prixCommande = prixCommande;
	}

}
