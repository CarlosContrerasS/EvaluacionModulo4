package awl.modulo4.model;

public class Empleado {

	private int Rut_Empleado;
	private String nombreempleado;
	private String especialidad;
	
	
	
	public Empleado(int Rut_Empleado, String nombreempleado, String especialidad) {
		this.Rut_Empleado = Rut_Empleado;
		this.nombreempleado = nombreempleado;
		this.especialidad = especialidad;
	}

	public Empleado() {
		
	}

	public int getRut_Empleado() {
		return Rut_Empleado;
	}



	public void setRut_Empleado(int Rut) {
		this.Rut_Empleado = Rut;
	}



	public String getNombreempleado() {
		return nombreempleado;
	}



	public void setNombreempleado(String nombreempleado) {
		this.nombreempleado = nombreempleado;
	}



	public String getEspecialidad() {
		return especialidad;
	}



	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}



	@Override
	public String toString() {
		return "Empleado [Rut_Empleado=" + Rut_Empleado + ", nombreempleado=" + nombreempleado + ", especialidad="
				+ especialidad + "]";
	}



	
	
}