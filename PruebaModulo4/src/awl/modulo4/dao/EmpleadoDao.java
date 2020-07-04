package awl.modulo4.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import awl.modulo4.conexion.ConexionSingleton;
import awl.modulo4.idao.IEmpleadoDao;
import awl.modulo4.model.Empleado;

public class EmpleadoDao implements IEmpleadoDao {

	public boolean agregar(Empleado empleado) {
		boolean agregar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "INSERT INTO Empleado VALUES ('" + empleado.getRut_empleado() + "','" + empleado.getNombreempleado() + "','" + empleado.getEspecialidad() + "')";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			agregar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase EmpleadoDao, método agregar");
			e.printStackTrace();
		}
		
		return agregar;
	}

	@Override
	public List<Empleado> listar() {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from Empleado ORDER BY rut_empleado";
		
		List<Empleado> listaCliente = new ArrayList<Empleado>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Empleado c = new Empleado();
				c.setRut_empleado(rs.getInt(1));
				c.setNombreempleado(rs.getString(2));
				c.setEspecialidad(rs.getString(3));
				listaCliente.add(c);
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase EmpleadDao, método listar ");
			e.printStackTrace();
		}
		
		return listaCliente;
	}

	@Override
	public boolean actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		
		boolean actualizar = false;
		
		String sql = "UPDATE Empleado SET nombre = '" + empleado.getNombreempleado()  + "', especialidad = '" + empleado.getEspecialidad() + "' WHERE rut_empleado = '" + empleado.getRut_empleado() + "'";
		
		System.out.println(sql);
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			actualizar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase EmpleadoDao, método actualizar");
			e.printStackTrace();
		}
		
		return actualizar;
	}

	@Override
	public boolean eliminar(Empleado empleado) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		
		boolean eliminar = false;
		
		String sql = "DELETE FROM Empleado WHERE rut_empleado = " + empleado.getRut_empleado();
	
		
		try {
			con = ConexionSingleton.getConnection();
			
			stm = con.createStatement();
			
			stm.execute(sql);
			
			eliminar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase EmpleadoDao, método eliminar");
			e.printStackTrace();
		}
		
		return eliminar;
	}

	@Override
	public Empleado buscar(int rut_empleado) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from Empleado WHERE rut_empleado = '" + rut_empleado + "'";
		
		Empleado emp = new Empleado();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				emp.setRut_empleado(rs.getInt(1));
				emp.setNombreempleado(rs.getString(2));
				emp.setEspecialidad(rs.getString(3));
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase EmpleadoDao, método buscar ");
			e.printStackTrace();
		}
		
		return emp;
	}

}
