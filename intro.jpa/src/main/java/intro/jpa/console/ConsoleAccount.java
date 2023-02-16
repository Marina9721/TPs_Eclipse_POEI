package intro.jpa.console;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import intro.jpa.entity.Account;
import intro.jpa.entity.Credential;

public class ConsoleAccount {
	public static void main(String[] args) {
		ConsoleAccount service = new ConsoleAccount();
			
		//Get by id
		Account getAccount = service.getById(2);
		System.out.println(getAccount);
			
		//Get all
		List<Account> accounts = service.getAll();
		for(Account a : accounts) {
			System.out.println(a);
		}
		
		//Create 
		Account newAccount = new Account("Marina", "Garin", new Date(), 623, 9,new Credential("Marina21", "toto"));
		service.create(newAccount);
	}
	
	public Account getById(int id) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();	

			return em.find(Account.class, id);
		}finally {
			if(em!=null) em.close();
			if(emf!=null) emf.close();
		}
	}
	
	public List<Account> getAll() {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();	

			return em.createQuery("From Account", Account.class).getResultList();
		}finally {
			if(em!=null) em.close();
			if(emf!=null) emf.close();
		}
	}
	
	public void create(Account a) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();	
			
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			
			em.persist(a.getCredential());
			em.persist(a);
			
			trans.commit();
		}finally {
			if(em!=null) em.close();
			if(emf!=null) emf.close();
		}
	}
	
	
	public static void update(Account a) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();	
			
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			
			Account account = em.find(Account.class, a.getId());
			
			account.setFirstName(a.getFirstName());
			account.setLastName(a.getLastName());
			account.setCredential(a.getCredential());
			account.setDateCreation(a.getDateCreation());
			account.setNbMessagesSent(a.getNbMessagesSent());
			account.setNbFriends(a.getNbFriends());
			
			em.persist(account.getCredential());
			em.persist(account);
			
			trans.commit();
		}finally {
			if(em!=null) em.close();
			if(emf!=null) emf.close();
		}
	}
	
	public void delete(Account a) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();	
			
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			
			Account account = em.find(Account.class, a.getId());
			em.remove(account);
			trans.commit();
			
		}finally {
			if(em!=null) em.close();
			if(emf!=null) emf.close();
		}
	}

}
