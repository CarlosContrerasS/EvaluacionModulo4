package awl.modulo4.idao;

import java.util.List;

import awl.modulo4.model.Visita;

public interface IVisitaDao {
	
	public boolean agregar(Visita visita);
	public List<Visita> listar();
	public boolean actualizar(Visita visita);
	public boolean eliminar (Visita visita);
	public Visita buscar(int idvisita);

}
