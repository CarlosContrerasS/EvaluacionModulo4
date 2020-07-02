package awl.modulo4.model;

public class Asesoria {

	private int idasesoria;
	private String detalle;
	private String gestion;
	private String propuestas;
	private String fecha;
	private String especial;
	private int visitaid;
	
	
	
	public Asesoria(String detalle, String gestion, String propuestas, String fecha, String especial, int visitaid) {
		this.detalle = detalle;
		this.gestion = gestion;
		this.propuestas = propuestas;
		this.fecha = fecha;
		this.especial = especial;
		this.visitaid = visitaid;
	}



	public int getIdasesoria() {
		return idasesoria;
	}



	public void setIdasesoria(int idasesoria) {
		this.idasesoria = idasesoria;
	}



	public String getDetalle() {
		return detalle;
	}



	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}



	public String getGestion() {
		return gestion;
	}



	public void setGestion(String gestion) {
		this.gestion = gestion;
	}



	public String getPropuestas() {
		return propuestas;
	}



	public void setPropuestas(String propuestas) {
		this.propuestas = propuestas;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public String getEspecial() {
		return especial;
	}



	public void setEspecial(String especial) {
		this.especial = especial;
	}



	public int getVisitaid() {
		return visitaid;
	}



	public void setVisitaid(int visitaid) {
		this.visitaid = visitaid;
	}



	@Override
	public String toString() {
		return "Asesoria [idasesoria=" + idasesoria + ", detalle=" + detalle + ", gestion=" + gestion + ", propuestas="
				+ propuestas + ", fecha=" + fecha + ", especial=" + especial + ", visitaid=" + visitaid + "]";
	}
	
	
}
