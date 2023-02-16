package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UtileConnection {
	
	public static Connection seConnecter() {
		String DRIVER = "org.postgresql.Driver";
		String URL = "jdbc:postgresql://localhost:5432/hello";
		String LOGIN = "postgres";
		String PASSWORD = "toto";
		
		Connection connection = null;
		
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
		}catch(SQLException e) {
			System.out.println("SQLException");
		}catch(ClassNotFoundException e1){
			System.out.println("ClassNotFoundException");
		}
		
		return connection;
	}
}
