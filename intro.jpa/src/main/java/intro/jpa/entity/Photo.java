package intro.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="photos")
public class Photo {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="url")
	private String url;
	
	@Column(name="localisation")
	private String localisation;
	
	@Column(name="nom")
	private String nom;

	public Photo(int id, String url, String localisation, String nom) {
		super();
		this.id = id;
		this.url = url;
		this.localisation = localisation;
		this.nom = nom;
	}

	public Photo(String url, String localisation, String nom) {
		super();
		this.url = url;
		this.localisation = localisation;
		this.nom = nom;
	}

	public Photo() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Photo [id=" + id + ", url=" + url + ", localisation=" + localisation + ", nom=" + nom + "]";
	}
	
}
