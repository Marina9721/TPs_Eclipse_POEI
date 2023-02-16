package intro.jpa.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity @Table(name="account")
public class Account {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="date_creation")
	private Date dateCreation;
	
	@Column(name="nb_messages_sent")
	private int nbMessagesSent;
	
	@Column(name="nb_friends")
	private int nbFriends;
	
	@OneToOne
	@JoinColumn(name="credentials_id", nullable=false)
	private Credential credential;

	public Account() {
		super();
	}

	public Account(String firstName, String lastName, Date dateCreation, int nbMessagesSent, int nbFriends,
			Credential credential) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateCreation = dateCreation;
		this.nbMessagesSent = nbMessagesSent;
		this.nbFriends = nbFriends;
		this.credential = credential;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public int getNbMessagesSent() {
		return nbMessagesSent;
	}

	public void setNbMessagesSent(int nbMessagesSent) {
		this.nbMessagesSent = nbMessagesSent;
	}

	public int getNbFriends() {
		return nbFriends;
	}

	public void setNbFriends(int nbFriends) {
		this.nbFriends = nbFriends;
	}

	public Credential getCredential() {
		return credential;
	}

	public void setCredential(Credential credential) {
		this.credential = credential;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateCreation="
				+ dateCreation + ", nbMessagesSent=" + nbMessagesSent + ", nbFriends=" + nbFriends + "]";
	}

}
