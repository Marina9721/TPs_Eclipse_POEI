package entity;

public class Annonce {
	private int id;
	private String titre;
	private String datePublication;
	private String photos;
	private int prix;
	private String description;
	private String categorie;
	private int id_utilisateur;
	
	public Annonce() {
		super();
	}
	
	public Annonce(String titre, String datePublication, String photos, int prix, String description,
			String categorie, int id_utilisateur) {
		super();
		this.titre = titre;
		this.datePublication = datePublication;
		this.photos = photos;
		this.prix = prix;
		this.description = description;
		this.categorie = categorie;
		this.id_utilisateur = id_utilisateur;
	}
	
	public Annonce(int id, String titre, String datePublication, String photos, int prix, String description,
			String categorie, int id_utilisateur) {
		super();
		this.id = id;
		this.titre = titre;
		this.datePublication = datePublication;
		this.photos = photos;
		this.prix = prix;
		this.description = description;
		this.categorie = categorie;
		this.id_utilisateur = id_utilisateur;
	}
	
	public Annonce(int id, String titre, String photos, int prix, String description, String categorie) {
		super();
		this.id = id;
		this.titre = titre;
		this.photos = photos;
		this.prix = prix;
		this.description = description;
		this.categorie = categorie;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDatePublication() {
		return datePublication;
	}

	public void setDatePublication(String datePublication) {
		this.datePublication = datePublication;
	}

	public String getPhotos() {
		return photos;
	}

	public void setPhotos(String photos) {
		this.photos = photos;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public int getId_utilisateur() {
		return id_utilisateur;
	}

	public void setId_utilisateur(int id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}	

	
}
