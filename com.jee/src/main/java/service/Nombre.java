package service;

public class Nombre {
	
	private int monNombre;
	
	public Nombre(int pMonNombre) {
		this.monNombre = pMonNombre;
	}
	
	
	public int getMonNombre() {
		return monNombre;
	}

	public void setMonNombre(int monNombre) {
		this.monNombre = monNombre;
	}



	public static int addIntegers(int n1, int n2) {
		return n1 + n2;
	}
	
	public Nombre multiplication(Nombre n) {
		return new Nombre(this.monNombre*n.getMonNombre());
	}
	
	public Nombre square() {
		return new Nombre((int)Math.pow(this.monNombre, 2));
	}
	
	public Nombre division(Nombre n) {
		return new Nombre(this.monNombre/n.getMonNombre());
	}
	
	// autre écriture
	public Nombre pow(Nombre n) {
		this.monNombre = (int)Math.pow(this.monNombre, n.getMonNombre());
		return this;
	}
	
	public Nombre log2() {
		return new Nombre((int)(Math.log(this.monNombre)/Math.log(2)));
	}

}
