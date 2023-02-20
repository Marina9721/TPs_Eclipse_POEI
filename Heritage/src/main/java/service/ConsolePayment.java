package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import SINGLE_TABLE.DPayment;

public class ConsolePayment {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();
			
			List<DPayment> payments = em.createQuery("from Payment", DPayment.class).getResultList();
			
			for (DPayment payment : payments) {
				System.out.println( payment.getClass().getName() );
				System.out.println( "\t" + payment);
			}
			
		} finally {
			if (emf != null) emf.close();
			if (em != null) em.close();
		}
		
	}

}
