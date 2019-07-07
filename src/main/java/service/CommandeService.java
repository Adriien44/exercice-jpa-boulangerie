package service;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entity.Chocolatine;
import entity.Commande;
import util.Constante;

public class CommandeService {

	public static final EntityManagerFactory EMF = Constante.EMF;
	Scanner sc = new Scanner(System.in);
	ChocolatineService choco = new ChocolatineService();
	Chocolatine ohcho = new Chocolatine();

	// *** EN COURS DE DÉVELOPPEMENT ***

	public void creerCommande() {

		EntityManager emCommande = EMF.createEntityManager();
		EntityTransaction txCommande = emCommande.getTransaction();

		Commande commande = new Commande();
		emCommande.persist(commande);

		// Chocolatine chocho = new Chocolatine();

		choco.listerChocolatine();
		System.out.println("Que souhaitez-vous commander ? ");
		// chocho.setId(sc.nextInt());

		System.out.println("Quel sera la quantité ?");
		sc.nextLine();
		System.out.println("Souhaitez-vous ajouter d'autres produits à votre commande ?");
		sc.nextLine();

		/*
		 * instancier CommandeChocolatine cc.setId(); cc.setChoco (choco)
		 * cc.setCommande(cc)
		 */

	}

}
