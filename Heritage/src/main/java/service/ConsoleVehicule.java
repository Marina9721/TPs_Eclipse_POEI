package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import SINGLE_TABLE.DVehicule;

public class ConsoleVehicule {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();
			
			List<DVehicule> vehicules = em.createQuery("from DVehicule", DVehicule.class).getResultList();
			
			for (DVehicule dVehicule : vehicules) {
				System.out.println( dVehicule.getClass().getName() );
				System.out.println( "\t" + dVehicule);
			}
			
		} finally {
			if (emf != null) emf.close();
			if (em != null) em.close();
		}
		
	}
}
