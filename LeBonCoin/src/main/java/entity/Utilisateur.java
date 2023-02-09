package entity;

public class Utilisateur {
	private int id;
	private String nomUtilisateur;
	private String nom;
	private String prenom;
	private String email;
	private String motDePasse;
	
	public Utilisateur() {
		super();
	}
	
	public Utilisateur(String nomUtilisateur, String nom, String prenom, String email, String motDePasse) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motDePasse = motDePasse;
	}

	public Utilisateur(int id, String nomUtilisateur, String nom, String prenom, String email, String motDePasse) {
		super();
		this.id = id;
		this.nomUtilisateur = nomUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motDePasse = motDePasse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
}
