package awl.modulo4.idao;

import java.util.List;

import awl.modulo4.model.Pago;



public interface IPagoDao {

	public boolean agregar(Pago pago);
	public List<Pago> listar();
	public boolean actualizar(Pago cliente);
	public boolean eliminar (Pago cliente);
	public Pago buscar(int rutcliente);	
	



}


