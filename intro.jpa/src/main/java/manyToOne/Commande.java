package manyToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name="commandes")
public class Commande {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	public String description;
	
	@ManyToOne @JoinColumn(name="id_user")
	private User user;

	
	public Commande() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", description=" + description + "]";
	}
	
	
}
