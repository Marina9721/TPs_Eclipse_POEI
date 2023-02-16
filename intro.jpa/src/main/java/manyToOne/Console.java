package manyToOne;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Console {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
            emf = Persistence.createEntityManagerFactory("my-jpa-conf");
            em = emf.createEntityManager();
			
            Commande c = em.find(Commande.class, 4);
            System.out.println(c);
            
            System.out.println( c.getUser() );
            
            System.out.println("=================================");
            
            User u = em.find(User.class, 2);
            System.out.println(u);
            
            List<Commande> commandes = u.getCommandes();
            
            for (Commande commande : commandes) {
				System.out.println(commande);
			}
            
            System.out.println("=================================");
            
            Message m = em.find(Message.class, 2);
            System.out.println(m);

		} finally {
            if ( em != null ) em.close();
            if ( emf != null ) emf.close();
		}
				
		
	}
}
