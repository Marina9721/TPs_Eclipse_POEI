package JOINED;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="j_avion")
@PrimaryKeyJoinColumn(name="id_vehicule")
public class JAvion extends JVehicule {
	private int altitude;
	
	
	public JAvion() {
		super();
	}

	public JAvion(int altitude) {
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
