package awl.modulo4.model;

public class Visita {

	private int idvisita;
	private String direccion;
	private String ciudad;
	private String fecha;
	private String resumen;
	private String observaciones;
	private int Rut;
	private int Rut_Empleado;
	
	
	
	public Visita(String direccion, String ciudad, String fecha, String resumen, String observaciones, int Rut,
			int Rut_Empleado) {
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.fecha = fecha;
		this.resumen = resumen;
		this.observaciones = observaciones;
		this.Rut = Rut;
		this.Rut_Empleado = Rut_Empleado;
	}

	public Visita() {
		
	}

	public int getIdvisita() {
		return idvisita;
	}



	public void setIdvisita(int idvisita) {
		this.idvisita = idvisita;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getCiudad() {
		return ciudad;
	}



	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public String getResumen() {
		return resumen;
	}



	public void setResumen(String resumen) {
		this.resumen = resumen;
	}



	public String getObservaciones() {
		return observaciones;
	}



	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	public int getRut() {
		return Rut;
	}



	public void setRut(int Rut) {
		this.Rut = Rut;
	}



	public int getRut_Empleado() {
		return Rut_Empleado;
	}



	public void setRut_Empleado(int Rut_Empleado) {
		this.Rut_Empleado = Rut_Empleado;
	}



	@Override
	public String toString() {
		return "Visita [idvisita=" + idvisita + ", direccion=" + direccion + ", ciudad=" + ciudad + ", fecha=" + fecha
				+ ", resumen=" + resumen +  ", rutcliente=" + Rut
				+ ", rutempleado=" + Rut_Empleado + "]";
	}
	
	
	
}
