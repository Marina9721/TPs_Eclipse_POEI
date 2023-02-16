package tp.farm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name = "animaux")
public class Animaux {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int nombre;
	
	private String nom;
	
	private int prix;
	
	@ManyToOne @JoinColumn(name = "farm_id")
	private Farm farm;
	
	
	public Animaux() {
		super();
	}

	public Animaux(int nombre, String nom, int prix, Farm farm) {
		super();
		this.nombre = nombre;
		this.nom = nom;
		this.prix = prix;
		this.farm = farm;
	}

	public Animaux(int id, int nombre, String nom, int prix, Farm farm) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nom = nom;
		this.prix = prix;
		this.farm = farm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
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

	public Farm getFarm() {
		return farm;
	}

	public void setFarm(Farm farm) {
		this.farm = farm;
	}

	@Override
	public String toString() {
		return "Animaux [id=" + id + ", nombre=" + nombre + ", nom=" + nom + ", prix=" + prix + "]";
	}

}
