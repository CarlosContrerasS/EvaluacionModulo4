package awl.modulo4.model;

public class Accidente {

	private int idaccidente;
	private String fecha;
	private String hora;
	private String suceso;
	private String lugar;
	private int rut;
	private int dias;
	private int num_trab;
	
	
	public Accidente( String fecha, String hora, String suceso, String lugar, int rut, int dias,
			int num_trab) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.suceso = suceso;
		this.lugar = lugar;
		this.rut = rut;
		this.dias = dias;
		this.num_trab = num_trab;
	}
	
	public Accidente() {
		
	}

	public int getIdaccidente() {
		return idaccidente;
	}
	public void setIdaccidente(int idaccidente) {
		this.idaccidente = idaccidente;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getSuceso() {
		return suceso;
	}
	public void setSuceso(String suceso) {
		this.suceso = suceso;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public int getNum_trab() {
		return num_trab;
	}
	public void setNum_trab(int num_trab) {
		this.num_trab = num_trab;
	}

	@Override
	public String toString() {
		return "Accidente [idaccidente=" + idaccidente + ", fecha=" + fecha + ", hora=" + hora + ", suceso=" + suceso
				+ ", lugar=" + lugar + ", rut=" + rut + ", dias=" + dias + ", num_trab=" + num_trab + "]";
	}

	

	
	
	
	
	
}
