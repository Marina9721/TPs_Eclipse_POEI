package tp.farm.console;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import tp.farm.entity.Machine;

public class MachineService {
	
	public static Machine getById(int id) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();	

			return em.find(Machine.class, id);
		}finally {
			if(em!=null) em.close();
			if(emf!=null) emf.close();
		}
	}
	
	public static List<Machine> getAll(){
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();
			
			return em.createQuery("From Machine", Machine.class).getResultList();
		}finally {
			
		}
	}
	
	public static void create(Machine m) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();	
			
			EntityTransaction trans = em.getTransaction();
			trans.begin();

			em.persist(m);
			
			trans.commit();
		}finally {
			if(em!=null) em.close();
			if(emf!=null) emf.close();
		}
	}
	
	public static void update(Machine m) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();	
			
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			
			Machine machine = em.find(Machine.class, m.getId());
			
			machine.setNom(m.getNom());
			machine.setPrix(m.getPrix());
			machine.setDateAchat(m.getDateAchat());
			
			em.persist(machine);
			
			trans.commit();
		}finally {
			if(em!=null) em.close();
			if(emf!=null) emf.close();
		}
	}
	
	public static void delete(Machine m) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();	
			
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			
			Machine machine = em.find(Machine.class, m.getId());
			em.remove(machine);
			trans.commit();
			
		}finally {
			if(em!=null) em.close();
			if(emf!=null) emf.close();
		}
	}

	
	public static void main(String[] args) {
		MachineService service = new MachineService();
		
		//Get by id
		Machine getMachine = service.getById(1);
		System.out.println(getMachine);
		
		//Get all
		List<Machine> machines = service.getAll();
		for(Machine m : machines) {
			System.out.println(m);
		}
		
		//Update
		Machine updateMachine = new Machine(3, "Machine a traire", 3999, new Date());
		service.update(updateMachine);

	}
}
