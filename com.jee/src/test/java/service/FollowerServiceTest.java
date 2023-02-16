package service;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;*/
import org.junit.jupiter.api.Test;

import dao.UtileConnection;
import entity.Follower;
import service.FollowerService;

public class FollowerServiceTest {
	
	public FollowerService service = new FollowerService();
	
	/*
	@BeforeAll
	void setUpBeforeClass() throws Exception {
		
		service = new FollowerService();	
		System.out.println("Before All");
	}

	@AfterAll
	void tearDownAfterClass() throws Exception {
		System.out.println("After All");

	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");

	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");

	}
	*/
	/*
	@Test
	public void test_add_follower_and_get_it_back() throws SQLException {
		
		Follower f = new Follower(8, "Brice");
		
		service.add(f);
		
		Connection con = UtileConnection.seConnecter();
		
		// on vérifie que ça a fonctionné en affichant la ligne qui contient le nom et l'âge qu'on vient d'entrer
		ResultSet rs = con.createStatement().executeQuery("SELECT * FROM followers WHERE age=45 AND name='Yoann';");
		
		assertTrue(rs.next());
		
		rs.close();
		con.close();
	}
	
	@Test
	public void test_delete_follower_and_check_if_it_was_deleted() throws SQLException {
		
		int id = 8;
		
		service.delete(id);
		
		Connection con = UtileConnection.seConnecter();
		
		ResultSet rs = con.createStatement().executeQuery("SELECT * FROM followers WHERE id="+id+";");
		
		assertFalse(rs.next());
		
		rs.close();
		con.close();
	}
	*/
	@Test
	public void test_update_follower_and_get_it_back() throws SQLException {
		
		Follower f = new Follower(9, 38, "Carla");
		
		service.update(f);
		
		Connection con = UtileConnection.seConnecter();
		
		ResultSet rs = con.createStatement().executeQuery("SELECT * FROM followers WHERE age=36 AND name='Carla';");
		
		assertTrue(rs.next());
		
		rs.close();
		con.close();
	}
	
	/*
	@Test
	public void test_get_follower_by_id() throws SQLException {
		
		 int id = 2;
		 
		 Follower f = service.getById(id);
		 
		 assertEquals(id, f.getId());
		 
		 
	}
	
	@Test
	public void test_get_all_followers() throws SQLException {

		 service.getAll();
		 
		 
	}
	*/
}
