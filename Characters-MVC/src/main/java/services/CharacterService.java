package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dao.UtilConnection;
import entity.Character;


public class CharacterService {
	
	public ArrayList<Character> getAll(){
		ArrayList<Character> listCharacters = new ArrayList<>();
		try {
			Connection con = UtilConnection.seConnecter();
			
			String query = "SELECT * FROM characters;";
			ResultSet rs = con.createStatement().executeQuery(query);
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int level = rs.getInt("level");
				int size = rs.getInt("size");
				String type = rs.getString("type");
				listCharacters.add(new Character(id, name, level, size, type));
			}
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return listCharacters;
	}
	
	public Character getById(int id) {
		try {
			Connection con = UtilConnection.seConnecter();
			
			PreparedStatement ps = con.prepareStatement("SELECT * FROM characters WHERE id=?;");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				String name = rs.getString("name");
				int level = rs.getInt("level");
				int size = rs.getInt("size");
				String type = rs.getString("type");
				return new Character(id, name, level, size, type);
			}
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}

		return null;
	}
	
	public void add(Character c) {
		try {
			Connection con = UtilConnection.seConnecter();
			
			PreparedStatement ps = con.prepareStatement("INSERT INTO characters(name,level, size, type) VALUES(?,?,?,?);");
			ps.setString(1, c.getName());
			ps.setInt(2, c.getLevel());
			ps.setInt(3, c.getSize());
			ps.setString(4, c.getType());
			
			ps.executeUpdate();
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void update(Character c) {
		try {
			Connection con = UtilConnection.seConnecter();
			
			PreparedStatement ps = con.prepareStatement("UPDATE characters SET name=?, level=?, size=?, type=? WHERE id=?;");
			ps.setString(1, c.getName());
			ps.setInt(2, c.getLevel());
			ps.setInt(3, c.getSize());
			ps.setString(4, c.getType());
			ps.setInt(5, c.getId());
			
			ps.executeUpdate();
			
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(int id) {
		try {
			Connection con = UtilConnection.seConnecter();
			
			PreparedStatement ps = con.prepareStatement("DELETE FROM characters WHERE id=?;");
			ps.setInt(1, id);
			ps.executeUpdate();
			
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
