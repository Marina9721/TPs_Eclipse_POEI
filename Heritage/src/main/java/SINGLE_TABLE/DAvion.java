package SINGLE_TABLE;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class DAvion extends DVehicule {
	private int altitude;
	
	
	public DAvion() {
		super();
	}

	public DAvion(int altitude) {
		super();
		this.altitude = altitude;
	}

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

	@Override
	public String toString() {
		return super.toString() + "DAvion [altitude=" + altitude + "]";
	}

}
