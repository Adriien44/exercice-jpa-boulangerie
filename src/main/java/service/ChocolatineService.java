package service;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import entity.Chocolatine;
import util.Constante;

public class ChocolatineService {

	public static final EntityManagerFactory EMF = Constante.EMF;

	Scanner sc = new Scanner(System.in);

	// *** LISTER LES CHOCOLATINES ***
	public void listerChocolatine() {
		EntityManager em = EMF.createEntityManager();
		TypedQuery<Chocolatine> query = em.createQuery("from Chocolatine", Chocolatine.class);
		List<Chocolatine> liste = query.getResultList();
		liste.forEach(System.out::println);
	}

	// *** AJOUTER UNE CHOCOLATINE ***
	public void creerChocolatine() {
		EntityManager emListe = EMF.createEntityManager();
		EntityTransaction transacAdd = emListe.getTransaction();

		Chocolatine chocolatine = new Chocolatine();

		System.out.println("Nom de la chocolatine");
		chocolatine.setNom(sc.nextLine());
		System.out.println("Température de la chocolatine");
		chocolatine.setTemperature(sc.nextFloat());
		System.out.println("Poids de la chocolatine");
		chocolatine.setPoids(sc.nextFloat());
		System.out.println("Prix de la chocolatine");
		chocolatine.setPrix(sc.nextInt());

		transacAdd.begin();
		emListe.persist(chocolatine);
		transacAdd.commit();
		emListe.close();

	}

}
