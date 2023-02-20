package entity;

public class User {
	private int id;
	private int age;
	private String name;
	private String email;
	private String password;
	private int nbArticles;
	
	public User(int id, int age, String name, String email, String password, int nbArticles) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.email = email;
		this.password = password;
		this.nbArticles = nbArticles;
	}

	public User() {
		super();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getNbArticles() {
		return nbArticles;
	}

	public void setNbArticles(int nbArticles) {
		this.nbArticles = nbArticles;
	}

}
