package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.UtileConnection;
import entity.Follower;

public class FollowerService {
	
	public List<Follower> getAll(){
		List<Follower> listFollowers = new ArrayList<Follower>();
		try {
			Connection con = UtileConnection.seConnecter();
			String query = "SELECT * FROM Followers;";
			ResultSet rs = con.createStatement().executeQuery(query);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				int age = rs.getInt("age");
				String name = rs.getString("name");
				listFollowers.add(new Follower(id, age, name));
			}
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return listFollowers;
	}
	
	public Follower getById(int id) {
		try {
			Connection con = UtileConnection.seConnecter();
			String query = "SELECT * FROM Followers WHERE id=" + id + ";";
			ResultSet rs = con.createStatement().executeQuery(query);
			
			if(rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				return new Follower(id, age, name);
			}
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}

		return null;
	}
	
	public void add(Follower f) {
		try {
			Connection con = UtileConnection.seConnecter();
			
			String query = "INSERT INTO Followers(name,age) VALUES ('"+ f.getName() +"', "+ f.getAge() +")";
			Statement st = con.createStatement();
			st.execute(query);
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(Follower f) {
		try {
			Connection con = UtileConnection.seConnecter();
			
			String query = "UPDATE Followers SET age=" + f.getAge() + ", name=" + f.getName() + "WHERE id=" + f.getId();
			Statement st = con.createStatement();
			st.execute(query);
			
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void delete(int id) {
		try {
			Connection con = UtileConnection.seConnecter();
			
			String query = "DELETE FROM Followers WHERE id=" + id + ";";
			Statement st = con.createStatement();
			st.execute(query);
			
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}