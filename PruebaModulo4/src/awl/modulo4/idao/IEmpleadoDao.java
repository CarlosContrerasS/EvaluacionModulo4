package awl.modulo4.idao;

import java.util.List;

import awl.modulo4.model.Empleado;

public interface IEmpleadoDao {

	public boolean agregar(Empleado empleado);
	public List<Empleado> listar();
	public boolean actualizar(Empleado empleado);
	public boolean eliminar (Empleado empleado);
	public Empleado buscar(int idempleado);
}
