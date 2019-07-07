package entity;

public class Livreur {

	private Integer id;
	private String nom;
	private String prenom;
	private Commande commande;

	public Livreur(Integer id, String nom, String prenom, Commande commande) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.commande = commande;
	}

	public Livreur() {

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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livreur [id=");
		builder.append(id);
		builder.append(", nom=");
		builder.append(nom);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append(", commande=");
		builder.append(commande);
		builder.append("]");
		return builder.toString();
	}

}
