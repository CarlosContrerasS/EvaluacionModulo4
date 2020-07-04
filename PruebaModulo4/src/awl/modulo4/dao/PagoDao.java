package awl.modulo4.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import awl.modulo4.conexion.ConexionSingleton;
import awl.modulo4.idao.IPagoDao;
import awl.modulo4.model.Pago;

public class PagoDao implements IPagoDao {
	
	public boolean agregar(Pago pago) {
		// TODO Auto-generated method stub
		boolean agregar = false;
		
		Statement stm = null;
		Connection con = null;
		

		
		String sql = "INSERT INTO Pagos VALUES(null,'"+ pago.getMesanio()+"','"+ pago.getMontoregular()+"','"+ pago.getMontoadicionales()+"','"
				+ pago.getRut() + "')";
		
		
		try {
			con = ConexionSingleton.getConnection();
			
			stm = con.createStatement();
		
			stm.execute(sql);
		
			agregar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase PagoDao, método agregar");
			e.printStackTrace();
		}
		
		return agregar;
	}

	public List<Pago> listar() {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from Pagos ORDER BY IDPAGO";
		
		List<Pago> listaPagos = new ArrayList<Pago>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Pago p = new Pago();
				p.setRut(rs.getInt(1));
				p.setMesanio(rs.getString(2));
				p.setMontoregular(rs.getInt(3));
				p.setMontoadicionales(rs.getInt(4));
				listaPagos.add(p);
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase PagoDao, método listar ");
			e.printStackTrace();
		}
		
		return listaPagos;
	}

	public boolean actualizar(Pago pago) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		
		boolean actualizar = false;
		
		String sql = "UPDATE Pagos SET nombre = '" + pago.getMesanio() + "', fecha = '" + pago.getMontoregular() + "', montoregular = '"  ;
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			actualizar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase ClienteDao, método actualizar");
			e.printStackTrace();
		}
		
		return actualizar;
	}

	@Override
	public boolean eliminar(Pago pago) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Pago buscar(int idpago) {
		// TODO Auto-generated method stub
		return null;
	}
}