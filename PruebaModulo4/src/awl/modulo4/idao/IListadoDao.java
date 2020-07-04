package awl.modulo4.idao;

import java.util.List;

import awl.modulo4.model.Listado;


public interface IListadoDao {
	
	public List<Listado> listar(int rut_cliente);
	public List<Listado> listar();

}
