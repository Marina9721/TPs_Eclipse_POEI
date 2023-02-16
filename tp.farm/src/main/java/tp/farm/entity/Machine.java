package tp.farm.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name = "machine")
public class Machine {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nom;
	
	private int prix;
	
	@Column(name = "date_achat")
	private Date dateAchat;
	
	@ManyToOne
	@JoinTable(name = "farm_machine", joinColumns = @JoinColumn(name="machine_id"), 
	inverseJoinColumns = @JoinColumn(name = "farm_id"))
	private Farm farm;
	
	
	public Machine() {
		super();
	}

	public Machine(String nom, int prix, Date dateAchat, Farm farm) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.dateAchat = dateAchat;
	}

	public Machine(int id, String nom, int prix, Date dateAchat, Farm farm) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.dateAchat = dateAchat;
		this.farm = farm;
	}
	
	public Machine(int id, String nom, int prix, Date dateAchat) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.dateAchat = dateAchat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public Farm getFarm() {
		return farm;
	}

	public void setFarm(Farm farm) {
		this.farm = farm;
	}

	@Override
	public String toString() {
		return "Machine [id=" + id + ", nom=" + nom + ", prix=" + prix + ", dateAchat=" + dateAchat + "]";
	}
	
}
