package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DAO.UtileConnection;
import entity.Annonce;

public class AnnonceService {
	
	public Annonce getByCategorie(String Categorie) {
		try {
			Connection con = UtileConnection.seConnecter();
			
			PreparedStatement ps = con.prepareStatement("SELECT * FROM annonces WHERE categorie=?;");
			ps.setString(1, Categorie);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				String titre = rs.getString("titre");
				String datePublication = rs.getString("datePublication");
				String photos = rs.getString("photos");
				int prix = rs.getInt("prix");
				String description = rs.getString("description");
				String categorie = rs.getString("categorie");
				int id_utilisateur = rs.getInt("id_utilisateur");
				
				return new Annonce(titre, datePublication, photos, prix, description, categorie, id_utilisateur);
			}
			
			con.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Annonce> getAll(){
		ArrayList<Annonce> listeAnnonces = new ArrayList<>();
		try {
			Connection con = UtileConnection.seConnecter();
			
			String query = "SELECT * FROM annonces;";
			ResultSet rs = con.createStatement().executeQuery(query);
			while(rs.next()) {
				int id = rs.getInt("id");
				String titre = rs.getString("titre");
				String datePublication = rs.getString("datePublication");
				String photos = rs.getString("photos");
				int prix = rs.getInt("prix");
				String description = rs.getString("description");
				String categorie = rs.getString("categorie");
				int id_utilisateur = rs.getInt("id_utilisateur");
				listeAnnonces.add(new Annonce(id, titre, datePublication, photos, prix, description, categorie, id_utilisateur));
			}
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return listeAnnonces;
	}
	
	public void create(Annonce a) {
		try {
			Connection con = UtileConnection.seConnecter();
			
			PreparedStatement ps = con.prepareStatement("INSERT INTO annonces(titre, datePublication, photos, prix, description, categorie, id_utilisateur)"
					+ "VALUES(?,?,?,?,?,?,?);");
			ps.setString(1, a.getTitre());
			ps.setString(2, a.getDatePublication());
			ps.setString(3, a.getPhotos());
			ps.setInt(4, a.getPrix());
			ps.setString(5, a.getDescription());
			ps.setString(6, a.getCategorie());
			
			ps.executeUpdate();
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void update(Annonce a) {
		try {
			Connection con = UtileConnection.seConnecter();
			
			PreparedStatement ps = con.prepareStatement("UPDATE annonces SET titre=?, datePublication=?, photos=?, prix=?, "
					+ "description=?, categorie=?, id_utilisateur=? WHERE id=?;");
			ps.setString(1, a.getTitre());
			ps.setString(2, a.getDatePublication());
			ps.setString(3, a.getPhotos());
			ps.setInt(4, a.getPrix());
			ps.setString(5, a.getDescription());
			ps.setString(6, a.getCategorie());
			ps.setInt(7, a.getId());
			
			ps.executeUpdate();
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(int id) {
		try {
			Connection con = UtileConnection.seConnecter();
			
			PreparedStatement ps = con.prepareStatement("DELETE FROM annonces WHERE id=?");
			ps.setInt(1, id);
			ps.executeUpdate();
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
