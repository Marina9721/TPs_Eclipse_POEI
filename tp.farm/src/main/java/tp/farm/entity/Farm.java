package tp.farm.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity @Table(name = "farm")
public class Farm {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nom;
	
	private String localisation;
	
	private int superficie;
	
	@OneToMany(targetEntity = Animaux.class, mappedBy="farm")
	private List<Animaux> animaux;
	
	@OneToMany
	@JoinTable(name = "farm_machine", joinColumns = @JoinColumn(name = "farm_id"), 
			inverseJoinColumns = @JoinColumn(name = "machine_id"))
	private List<Machine> machines;
	
	
	
	public Farm() {
		super();
	}

	public Farm(String nom, String localisation, int superficie, List<Animaux> animaux, List<Machine> machines) {
		super();
		this.nom = nom;
		this.localisation = localisation;
		this.superficie = superficie;
		this.animaux = animaux;
		this.machines = machines;
	}

	public Farm(int id, String nom, String localisation, int superficie, List<Animaux> animaux,
			List<Machine> machines) {
		super();
		this.id = id;
		this.nom = nom;
		this.localisation = localisation;
		this.superficie = superficie;
		this.animaux = animaux;
		this.machines = machines;
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

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public List<Animaux> getAnimaux() {
		return animaux;
	}

	public void setAnimaux(List<Animaux> animaux) {
		this.animaux = animaux;
	}

	public List<Machine> getMachines() {
		return machines;
	}

	public void setMachines(List<Machine> machines) {
		this.machines = machines;
	}

	@Override
	public String toString() {
		return "Farm [id=" + id + ", nom=" + nom + ", localisation=" + localisation + ", superficie=" + superficie
				+ "]";
	}
	
}
