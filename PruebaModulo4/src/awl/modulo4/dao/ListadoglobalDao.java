package awl.modulo4.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import awl.modulo4.idao.IListadoDao;
import awl.modulo4.conexion.ConexionSingleton;
import awl.modulo4.model.Listado;



public class ListadoglobalDao implements IListadoDao {
	@Override
	
	public List<Listado> listar(int rut_cliente) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		
	String sql = "select cli.RUT, cli.nombre , vis.fecha , vis.empleado_rut_empleado , pag.MontoRegular, pag.mesanio,  acci.fecha, acci.suceso from Cliente cli 	INNER JOIN Visitas vis on cli.RUT = vis.RUT_ID INNER JOIN Pagos pag on pag.RUT_ID = vis.RUT_ID INNER JOIN Accidentes acci on acci.rut_id = vis.RUT_ID 	where cli.rut = " + rut_cliente;

	
	List<Listado> ListaGlobal = new ArrayList<Listado>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
					
			while (rs.next()) {
					
				Listado l = new Listado();
				l.setRut_cliente(rs.getInt(1));
				l.setNombre_cliente(rs.getNString(2));
				l.setFecha_visita(rs.getString(3) );
				l.setRut_empleado(rs.getInt(4));
				l.setMontoregular(rs.getInt(5));
				l.setMesanio(rs.getString(6));
				l.setFecha_accidente(rs.getString(7));
				l.setSuceso(rs.getString(8));
				
				ListaGlobal.add(l);				
			}
			stm.close();
			rs.close();
			//con.close();
			
		} catch(SQLException e) {
			System.out.println("Error: Clase ListaglobalDao, método listar ");
			e.printStackTrace();
		}	
		return ListaGlobal;
	}
	
	public List<Listado> listar() {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		
	String sql = "select cli.RUT, cli.nombre , vis.fecha , vis.empleado_rut_empleado , pag.MontoRegular, pag.mesanio,  acci.fecha, acci.suceso from Cliente cli 	INNER JOIN Visitas vis on cli.RUT = vis.RUT_ID INNER JOIN Pagos pag on pag.RUT_ID = vis.rut_id INNER JOIN Accidentes acci on acci.rut_id = vis.rut_id 	ORDER BY cli.rut";

	
	List<Listado> ListaGlobal = new ArrayList<Listado>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
					
			while (rs.next()) {
					
				Listado l = new Listado();
				l.setRut_cliente(rs.getInt(1));
				l.setNombre_cliente(rs.getNString(2));
				l.setFecha_visita(rs.getString(3) );
				l.setRut_empleado(rs.getInt(4));
				l.setMontoregular(rs.getInt(5));
				l.setMesanio(rs.getString(6));
				l.setFecha_accidente(rs.getString(7));
				l.setSuceso(rs.getString(8));
				
				ListaGlobal.add(l);				
			}
			stm.close();
			rs.close();
			//con.close();
			
		} catch(SQLException e) {
			System.out.println("Error: Clase ListaglobalDao, método listar ");
			e.printStackTrace();
		}	
		return ListaGlobal;
	}

}


	