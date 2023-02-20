package TABLE_PER_CLASS;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ConsoleTPayment {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();

			List<TPayment> payments = em.createQuery("from TPayment", TPayment.class).getResultList();
			
			for (TPayment payment : payments) {
				System.out.println( payment.getClass().getName() );
				System.out.println( "\t" + payment);
			}

			
		} finally {
			if (emf != null) emf.close();
			if (em != null) em.close();
		}
		
	}
}
