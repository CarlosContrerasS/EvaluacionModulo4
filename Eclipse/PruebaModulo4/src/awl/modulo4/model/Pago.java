package awl.modulo4.model;

public class Pago {

	private int rut;
	private String mesanio;
	private int montoregular;
	private int montoadicionales;
	
	
	public Pago() {
		
	}
	
	
	



	public Pago(int rut, String mesanio, int montoregular, int montoadicionales) {
		super();
		this.rut = rut;
		this.mesanio = mesanio;
		this.montoregular = montoregular;
		this.montoadicionales = montoadicionales;
	}


	public int getRut() {
		return rut;
	}



	public void setRut(int rut) {
		this.rut = rut;
	}


	public String getMesanio() {
		return mesanio;
	}




	public void setMesanio(String mesanio) {
		this.mesanio = mesanio;
	}




	public int getMontoregular() {
		return montoregular;
	}




	public void setMontoregular(int montoregular) {
		this.montoregular = montoregular;
	}




	public int getMontoadicionales() {
		return montoadicionales;
	}




	public void setMontoadicionales(int montoadicionales) {
		this.montoadicionales = montoadicionales;
	}






	@Override
	public String toString() {
		return "Pago [rut=" + rut + ", mesanio=" + mesanio + ", montoregular=" + montoregular
				+ ", montoadicionales=" + montoadicionales + "]";
	}


	


}