package dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

public class TestUtileConnection {
	
	@Test
	public void test_connection_object_is_returned() {
		
		Connection con = UtileConnection.seConnecter();
		assertNotNull(con);
	}

}
