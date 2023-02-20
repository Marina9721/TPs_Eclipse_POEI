package SINGLE_TABLE;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class DVoiture extends DVehicule {
	private int chevaux;
	
	private String marque;
	
	
	public DVoiture() {
		super();
	}

	public DVoiture(int chevaux, String marque) {
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
