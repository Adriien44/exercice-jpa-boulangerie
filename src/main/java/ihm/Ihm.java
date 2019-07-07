package ihm;

import java.util.Scanner;

import service.ChocolatineService;
import service.CommandeService;

public class Ihm {

	private static Scanner sc = new Scanner(System.in);

	public void cmdMenu() {

		int response = 0;
		ChocolatineService actionChoco = new ChocolatineService();
		CommandeService actionCommande = new CommandeService();

		do {
			System.out.println("**************************************");
			System.out.println("************* CHEZ GLEN **************");
			System.out.println("**************************************");
			System.out.println("* 1 - Lister les chocolatines        *");
			System.out.println("* 2 - Créer une chocolatine          *");
			System.out.println("* 3 - Créer une commande             *");
			System.out.println("* 4 - Top 5 Chocolatine              *");
			System.out.println("* 5 - Créer un livreur               *");
			System.out.println("* 6 - Affecter livreur à la commande *");
			System.out.println("**************************************");
			System.out.print("*Votre choix : ");

			response = sc.nextInt();

			switch (response) {
			case 1:
				actionChoco.listerChocolatine();
				break;

			case 2:
				actionChoco.creerChocolatine();
				break;

			case 3:
				actionCommande.creerCommande();
				break;

			case 4:
				;
				break;

			case 5:
				;
				break;

			case 6:
				;
				break;
			}
		}

		while (1 <= response && 6 >= response);
	}
}
