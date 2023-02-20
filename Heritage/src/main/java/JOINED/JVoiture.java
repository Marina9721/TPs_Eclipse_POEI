package JOINED;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="j_voiture")
@PrimaryKeyJoinColumn(name="id_vehicule")
public class JVoiture extends JVehicule{
private int chevaux;
	
	private String marque;
	
	
	public JVoiture() {
		super();
	}

	public JVoiture(int chevaux, String marque) {
		super();
		this.chevaux = chevaux;
		this.marque = marque;
	}

	public int getChevaux() {
		return chevaux;
	}

	public void setChevaux(int chevaux) {
		this.chevaux = chevaux;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	@Override
	public String toString() {
		return super.toString() + "DVoiture [chevaux=" + chevaux + ", marque=" + marque + "]";
	}

}
