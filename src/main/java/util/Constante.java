package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface Constante {

	EntityManagerFactory EMF = Persistence.createEntityManagerFactory("demo-jpa");

	public static EntityManagerFactory getEmf() {
		return EMF;
	}

}
