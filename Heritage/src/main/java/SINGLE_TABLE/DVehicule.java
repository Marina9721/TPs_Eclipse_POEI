package SINGLE_TABLE;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="d_vehicules")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="discriminator", discriminatorType=DiscriminatorType.INTEGER)
public class DVehicule {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	 
	private int vitesse;
	 
	private String name;
	 
	private int places;
	
	 
	public DVehicule() {
		super();
	}

	public DVehicule(int vitesse, String name, int places) {
		super();
		this.vitesse = vitesse;
		this.name = name;
		this.places = places;
	}

	public DVehicule(int id, int vitesse, String name, int places) {
		super();
		this.id = id;
		this.vitesse = vitesse;
		this.name = name;
		this.places = places;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPlaces() {
		return places;
	}

	public void setPlaces(int places) {
		this.places = places;
	}

	@Override
	public String toString() {
		return "DVehicule [id=" + id + ", vitesse=" + vitesse + ", name=" + name + ", places=" + places + "]";
	}

}
