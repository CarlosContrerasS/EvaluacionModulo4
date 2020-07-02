package awl.modulo4.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import awl.modulo4.idao.IVisitaDao;
import awl.modulo4.conexion.ConexionSingleton;
import awl.modulo4.model.Visita;

public class VisitaDao implements IVisitaDao {
	
	@Override
	public boolean agregar(Visita visita) {
		// TODO Auto-generated method stub
		boolean agregar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "INSERT INTO Visitas VALUES (null,'"+ visita.getDireccion()+ "','"+ visita.getCiudad() + "','" + visita.getFecha() + "','" 
		+ visita.getResumen() + "','" + visita.getObservaciones() + "','"+ visita.getRut() +"','"+ visita.getRut_Empleado() + "')";
		
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			agregar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase VisitaDao, método agregar");
			e.printStackTrace();
		}
		
		return agregar;
	}

	@Override
	public List<Visita> listar() {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from Visitas ORDER BY Idvisita";
		
		List<Visita> listaVisita = new ArrayList<Visita>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
					
				Visita v = new Visita();

				v.setIdvisita(rs.getInt(1));
				v.setDireccion(rs.getString(2));
				v.setCiudad(rs.getString(3));
				v.setFecha(rs.getString(4));
				v.setResumen(rs.getString(5));
				v.setObservaciones(rs.getNString(6));
				v.setRut(rs.getInt(7));
				v.setRut_Empleado(rs.getInt(8));
				
				listaVisita.add(v);
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase VisitaDao, método listar ");
			e.printStackTrace();
		}
		
		return listaVisita;
	}

	@Override
	public boolean actualizar(Visita visita) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		
		boolean actualizar = false;
		
		String sql = "UPDATE Visitas SET direccion = '" + visita.getDireccion() + "', ciudad = '" + visita.getCiudad() + "', fecha = '" + visita.getFecha()  
		+ "', resumen = '" + visita.getResumen() + "', observaciones = '" + visita.getObservaciones() + "', rut = '" + visita.getRut() + "', + rut_empleado = '" 
				+ visita.getRut_Empleado() + "' WHERE idvisita = '" + visita.getIdvisita() + "'";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			actualizar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase VisitaDao, método actualizar");
			e.printStackTrace();
		}
		
		return actualizar;
	}

	@Override
	public boolean eliminar(Visita visita) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		
		boolean eliminar = false;
		
		String sql = "DELETE FROM Visitas WHERE idvisita = " + visita.getIdvisita();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			eliminar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase VisitaDao, método eliminar");
			e.printStackTrace();
		}
		
		return eliminar;
	}

	@Override
	public Visita buscar(int idvisita) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from Visitas WHERE idvisita = '" + idvisita + "'";
		
		Visita vis = new Visita();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				vis.setIdvisita(rs.getInt(1));
				vis.setDireccion(rs.getString(2));
				vis.setCiudad(rs.getString(3));
				vis.setFecha(rs.getString(4));
				vis.setResumen(rs.getString(5));
				vis.setObservaciones(rs.getNString(6));
				vis.setRut(rs.getInt(7));
				vis.setRut_Empleado(rs.getInt(8));
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase VisitaDao, método buscar ");
			e.printStackTrace();
		}
		
		return vis;
	}

}
