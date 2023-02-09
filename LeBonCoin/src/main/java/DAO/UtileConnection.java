package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UtileConnection {
	public static Connection seConnecter() {
		String DRIVER = "org.postgresql.Driver";
		String URL = "jdbc:postgresql://localhost:5432/LeBonCoin";
		String LOGIN = "postgres";
		String PASSWORD = "toto";
		
		Connection connection = null;
		
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e1){
			e1.printStackTrace();
		}
		
		return connection;
	}
	
}