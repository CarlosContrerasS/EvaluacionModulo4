package awl.modulo4.model;

public class Empleado {

	private int rut_empleado;
	private String nombreempleado;
	private String especialidad;

	public Empleado(int rut_empleado, String nombreempleado, String especialidad) {
		super();
		this.rut_empleado = rut_empleado;
		this.nombreempleado = nombreempleado;
		this.especialidad = especialidad;
	}

	public Empleado() {

	}

	public int getRut_empleado() {
		return rut_empleado;
	}

	public void setRut_empleado(int rut_empleado) {
		this.rut_empleado = rut_empleado;
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
		return "Empleado [rut_empleado=" + rut_empleado + ", nombreempleado=" + nombreempleado + ", especialidad="
				+ especialidad + "]";
	}

	

}
