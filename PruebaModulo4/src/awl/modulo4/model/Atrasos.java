package awl.modulo4.model;

public class Atrasos {

	private String rut;
	private String nombre;
	private int idpago;
	private String mesanio;
	private int montoregular;
	private int montoadicionales;
		
	
	
	@Override
	public String toString() {
		return "Atrasos [rut=" + rut + ", nombre=" + nombre + ", idpago=" + idpago + ", mesanio=" + mesanio
				+ ", montoregular=" + montoregular + ", montoadicional=" + montoadicionales + "]";
	}


	public Atrasos() {
		
	}
		
		
	public Atrasos(String rut, String nombre, int idpago, String mesanio, int montoregular, int montoadicionales) {
		this.rut = rut;
		this.nombre = nombre;
		this.idpago = idpago;
		this.mesanio = mesanio;
		this.montoregular= montoregular;
		this.montoadicionales = montoadicionales;
		}




	public String getRut() {
		return rut;
	}




	public void setRut(String rut) {
		this.rut = rut;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public int getIdpago() {
		return idpago;
	}




	public void setIdpago(int idpago) {
		this.idpago = idpago;
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




	public int getMontoAdicionales() {
		return montoadicionales;
	}




	public void setMontoAdicionales(int adicionales) {
		this.montoadicionales = adicionales;
	}



		
		
	
	
	
}