package awl.modulo4.model;

public class Listado {
	
	private int rut_cliente;
	private String Nombre_cliente;
	private String fecha_visita;
	private int rut_empleado;
	private int montoregular;
	private String Mesanio;
	private String fecha_accidente;
	private String Suceso;


	
	public Listado(int rut_cliente, String Nombre_cliente, String fecha_visita, int rut_empleado, 
			int montoregular, String mesanio,  String fecha_accidente, String suceso) {
		
		this.rut_cliente = rut_cliente;
		this.Nombre_cliente = Nombre_cliente;
		this.fecha_visita = fecha_visita;
		this.rut_empleado = rut_empleado;
		this.montoregular = montoregular;
		this.Mesanio = mesanio;
		this.fecha_accidente = fecha_accidente;
		this.Suceso = suceso;
	}
	
	public Listado() {
		
	}

	public int getRut_cliente() {
		return rut_cliente;
	}

	public void setRut_cliente(int rut_cliente) {
		this.rut_cliente = rut_cliente;
	}

	public String getNombre_cliente() {
		return Nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		Nombre_cliente = nombre_cliente;
	}

	public String getFecha_visita() {
		return fecha_visita;
	}

	public void setFecha_visita(String fecha_visita) {
		this.fecha_visita = fecha_visita;
	}


	public int getRut_empleado() {
		return rut_empleado;
	}

	public void setRut_empleado(int rut_empleado) {
		this.rut_empleado = rut_empleado;
	}

	public int getMontoregular() {
		return montoregular;
	}

	public void setMontoregular(int montoregular) {
		this.montoregular = montoregular;
	}

	public String getFecha_accidente() {
		return fecha_accidente;
	}

	public void setFecha_accidente(String fecha_accidente) {
		this.fecha_accidente = fecha_accidente;
	}

	public String getMesanio() {
		return Mesanio;
	}

	public void setMesanio(String mesanio) {
		Mesanio = mesanio;
	}

	public String getSuceso() {
		return Suceso;
	}

	public void setSuceso(String suceso) {
		Suceso = suceso;
	}
	
	

}


