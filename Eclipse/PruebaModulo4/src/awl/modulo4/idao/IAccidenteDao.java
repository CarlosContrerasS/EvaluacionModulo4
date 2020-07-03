package awl.modulo4.idao;

import java.util.List;

import awl.modulo4.model.Accidente;


public interface IAccidenteDao {

	public boolean agregar(Accidente accidente);
	public List<Accidente> listar();
	public boolean actualizar(Accidente accidente);
	public boolean eliminar (Accidente accidente);
	public Accidente buscar(int rut);
}
