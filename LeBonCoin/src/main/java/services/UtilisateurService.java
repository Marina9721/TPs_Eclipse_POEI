package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DAO.UtileConnection;
import entity.Utilisateur;

public class UtilisateurService {
	
	public Utilisateur getById(int id) {
		try {
			Connection con = UtileConnection.seConnecter();
			
			PreparedStatement ps = con.prepareStatement("SELECT * FROM utilisateurs WHERE id=?;");
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				String nomUtilisateur = rs.getString("nomUtilisateur");
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String email = rs.getString("email");
				String motDePasse = rs.getString("motDePasse");
				return new Utilisateur(nomUtilisateur, nom, prenom, email, motDePasse);
			}
			con.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Utilisateur> getAll(){
		ArrayList<Utilisateur> listeUtilisateurs = new ArrayList<>();
		try {
			Connection con = UtileConnection.seConnecter();
			
			String query = "SELECT * FROM utilisateurs;";
			ResultSet rs = con.createStatement().executeQuery(query);
			while(rs.next()) {
				int id = rs.getInt("id");
				String nomUtilisateur = rs.getString("nomUtilisateur");
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String email = rs.getString("email");
				String motDePasse = rs.getString("motDePasse");
				listeUtilisateurs.add(new Utilisateur(id, nomUtilisateur, nom, prenom, email, motDePasse));
			}
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return listeUtilisateurs;
	}
	
	public void create(Utilisateur u) {
		try {
			Connection con = UtileConnection.seConnecter();
			
			PreparedStatement ps = con.prepareStatement("INSERT INTO utilisateurs(nomUtilisateur, nom, prenom, email, motDePasse)"
					+ "VALUES(?,?,?,?,?,?,?);");
			ps.setString(1, u.getNomUtilisateur());
			ps.setString(2, u.getNom());
			ps.setString(3, u.getPrenom());
			ps.setString(4, u.getEmail());
			ps.setString(5, u.getMotDePasse());
			
			ps.executeUpdate();
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void update(Utilisateur u) {
		try {
			Connection con = UtileConnection.seConnecter();
			
			PreparedStatement ps = con.prepareStatement("UPDATE utilisateurs SET nomUtilisateur=?, nom=?, prenom=?, email=?, "
					+ "motDePasse=? WHERE id=?;");
			ps.setString(1, u.getNomUtilisateur());
			ps.setString(2, u.getNom());
			ps.setString(3, u.getPrenom());
			ps.setString(4, u.getEmail());
			ps.setString(5, u.getMotDePasse());
			ps.setInt(6, u.getId());
			
			ps.executeUpdate();
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(int id) {
		try {
			Connection con = UtileConnection.seConnecter();
			
			PreparedStatement ps = con.prepareStatement("DELETE FROM utilisateurs WHERE id=?");
			ps.setInt(1, id);
			ps.executeUpdate();
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
