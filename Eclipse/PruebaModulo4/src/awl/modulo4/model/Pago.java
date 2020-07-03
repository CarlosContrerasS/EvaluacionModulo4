package awl.modulo4.model;

public class Pago {

	private int rutcliente;
	private String mesanio;
	private int montoregular;
	private int montoadicional;
	
	
	public Pago() {
		
	}
	
	
	



	public Pago(int rutcliente, String mesanio, int montoregular, int montoadicional) {
		super();
		this.rutcliente = rutcliente;
		this.mesanio = mesanio;
		this.montoregular = montoregular;
		this.montoadicional = montoadicional;
	}


	public int getRutcliente() {
		return rutcliente;
	}



	public void setRutcliente(int rutcliente) {
		this.rutcliente = rutcliente;
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




	public int getMontoadicional() {
		return montoadicional;
	}




	public void setMontoadicional(int montoadicional) {
		this.montoadicional = montoadicional;
	}






	@Override
	public String toString() {
		return "Pago [rutcliente=" + rutcliente + ", mesanio=" + mesanio + ", montoregular=" + montoregular
				+ ", montoadicional=" + montoadicional + "]";
	}


	


}