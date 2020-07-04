package awl.modulo4.model;

public class Cliente {

	private int rut;
	private String nombre;
	private int telefono;
	private String correoelectronico;
	private String rubro;
	private String direccion;
	
	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombre=" + nombre + ", telefono=" + telefono + ", correoelectronico="
				+ correoelectronico + ", rubro=" + rubro + ", direccion=" + direccion + "]";
	}

	public Cliente() {
		
	}
	
	public Cliente(int rut, String nombre, int telefono, String correoelectronico, String rubro, String direccion) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correoelectronico = correoelectronico;
		this.rubro = rubro;
		this.direccion = direccion;
	}

	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getCorreoelectronico() {
		return correoelectronico;
	}
	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}
	public String getRubro() {
		return rubro;
	}
	public void setRubro(String rubro) {
		this.rubro = rubro;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
}
