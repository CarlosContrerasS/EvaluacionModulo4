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
		
		//String sql ="INSERT INTO Empleado VALUES ('"+ empleado.getRut_Empleado()+ "','"+ empleado.getNombreempleado() + "','" + empleado.getEspecialidad() + "')";
		
		String sql = "INSERT INTO Empleado VALUES ('"+ empleado.getRut_Empleado()+ "','"+ empleado.getNombreempleado() + "','" + empleado.getEspecialidad() + "')";
		System.out.println(sql);
		try {
			con = ConexionSingleton.getConnection();
	
			stm = con.createStatement();
			stm.execute(sql);
			agregar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase EmpleadoDao, m�todo agregar");
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
		
		String sql = "select * from Empleado ORDER BY Rut_Empleado";
		
		List<Empleado> listaEmpleados = new ArrayList<Empleado>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Empleado em = new Empleado();
				em.setRut_Empleado(rs.getInt(1));
				em.setNombreempleado(rs.getString(2));
				em.setEspecialidad(rs.getString(3));
				listaEmpleados.add(em);
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase EmpleadoDao, m�todo listar ");
			e.printStackTrace();
		}
		
		return listaEmpleados;
	}

	@Override
	public boolean actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		
		System.out.println("Entro");
		Connection con = null;
		Statement stm = null;
		
		boolean actualizar = false;
		
		String sql = "UPDATE Empleado SET nombre = '" + empleado.getNombreempleado()  + "', especialidad = '" + empleado.getEspecialidad() + "' WHERE Rut_Empleado = '" + empleado.getRut_Empleado() + "'";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			actualizar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase EmpleadoDao, m�todo actualizar");
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
		
		String sql = "DELETE FROM Empleado WHERE Rut_Empleado = " + empleado.getRut_Empleado();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			eliminar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase EmpleadoDao, m�todo eliminar");
			e.printStackTrace();
		}
		
		return eliminar;
	}

	@Override
	public Empleado buscar(int Rut_Empleado) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from Empleado WHERE Rut_Empleado = '" + Rut_Empleado + "'";
		
		Empleado emp = new Empleado();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				emp.setRut_Empleado(rs.getInt(1));
				emp.setNombreempleado(rs.getString(2));
				emp.setEspecialidad(rs.getString(3));
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase EmpleadoDao, m�todo buscar ");
			e.printStackTrace();
		}
		
		return emp;
	}

}
