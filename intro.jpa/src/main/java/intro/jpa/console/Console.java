package intro.jpa.console;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import intro.jpa.entity.Photo;
import intro.jpa.entity.User;

public class Console {
	
	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();
			/*
			// Retrieve/SELECT
			User user = em.find(User.class, 4);
			System.out.println(user);
			
			// nom de la classe dans entity, ce n'est pas du SQL
			List<User> users = em.createQuery("From User", User.class).getResultList();
			
			for(User u : users) {
				System.out.println(u);
			}
			
			// UPDATE
			User user = em.find(User.class, 4);
			
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			
			user.setAge(20);
			em.persist(user);
			
			trans.commit();
			
			//CREATE
			
			User newUser = new User("Ruby", "Ruby on rails", "ruby@ruby.com", 9);
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			
			em.persist(newUser);
			
			trans.commit();
			
			// DELETE
			User user = em.find(User.class, 4);
			
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			
			em.remove(user);
			
			trans.commit();
			*/

			//SELECT ALL
			List<Photo> photos = em.createQuery("From Photo", Photo.class).getResultList();
			
			for(Photo p : photos) {
				System.out.println(p);
			}
			
			EntityTransaction trans = em.getTransaction();
			trans.begin();
/*
			Photo getPhoto = em.find(Photo.class, 2);
			System.out.println(getPhoto);
			
			Photo updatePhoto = em.find(Photo.class, 2);
			updatePhoto.setLocalisation("Saint Tropez");
			em.persist(updatePhoto);
			*/
			Photo newPhoto = new Photo("photo_1", "Saint-Tropez", "photo de vacances");
			em.persist(newPhoto);
			
			trans.commit();
		}finally {
			if(em!=null) em.close();
			if(emf!=null) emf.close();
		}
	}

}
