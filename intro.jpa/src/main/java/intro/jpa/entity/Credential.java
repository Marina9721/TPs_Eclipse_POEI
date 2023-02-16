package intro.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity @Table(name="credential")
public class Credential {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String login;
	private String password;
	
	@OneToOne(mappedBy="credential")
	private Account account;
	
	public Credential() {
		super();
	}

	public Credential(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Credential [id=" + id + ", login=" + login + ", password=" + password + "]";
	}

}
