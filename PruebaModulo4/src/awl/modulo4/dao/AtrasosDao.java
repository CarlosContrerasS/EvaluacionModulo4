package awl.modulo4.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import awl.modulo4.conexion.ConexionSingleton;
import awl.modulo4.idao.IAtrasosDao;
import awl.modulo4.model.Atrasos;

public class AtrasosDao implements IAtrasosDao {

	@Override
	public List<Atrasos> listar() {
			// TODO Auto-generated method stub
			Connection con = null;
			Statement stm = null;
			ResultSet rs = null;
			
			String sql = "SELECT Cliente.RUT, Cliente.nombre, Pagos.IDPago, pagos.mesanio , pagos.montoregular , pagos.montoadicionales from Cliente inner join Pagos on (pagos.rut_id = Cliente.RUT)"; 
			
			
			List<Atrasos> listaAtrasos = new ArrayList<Atrasos>();
			
			try {
				con = ConexionSingleton.getConnection();
				stm = con.createStatement();
				rs = stm.executeQuery(sql);
				while (rs.next()) {
					Atrasos a = new Atrasos();
					a.setRut(rs.getString(1));
					a.setNombre(rs.getString(2));				
					a.setIdpago(rs.getInt(3));
					a.setMesanio(rs.getString(4));
					a.setMontoregular(rs.getInt(5));
					a.setMontoAdicionales(rs.getInt(6));
					listaAtrasos.add(a);
				}
				
				stm.close();
				rs.close();
				//con.close();
			} catch(SQLException e) {
				System.out.println("Error: Clase AtrasosDao, método listar ");
				e.printStackTrace();
			}
			
			return listaAtrasos;
		}
} 
	
	
	
	



