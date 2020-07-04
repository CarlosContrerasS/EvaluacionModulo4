package awl.modulo4.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import awl.modulo4.conexion.ConexionSingleton;
import awl.modulo4.idao.IAccidenteDao;
import awl.modulo4.model.Accidente;


public class AccidenteDao implements IAccidenteDao {

	@Override
	public boolean agregar(Accidente accidente) {
		// TODO Auto-generated method stub
        boolean agregar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "INSERT INTO Accidentes VALUES(null,'"+ accidente.getFecha()+"','"+ accidente.getHora()+"','"+ accidente.getSuceso()+"','"
		+ accidente.getLugar()+"','"+ accidente.getRut()+"','"+accidente.getDias()+"','"+accidente.getNum_trab() + "')";
		
		System.out.println(sql);
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			agregar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: ClaseAccidenteDao, método agregar");
			e.printStackTrace();
		}
		
		return agregar;
	}
	
	@Override
	public List<Accidente> listar() {
	    
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select fecha,hora,suceso,lugar,rut_id,dias_perdidos,num_trab from Accidentes ORDER BY rut_id";
		
		List<Accidente> listaAccidente = new ArrayList<Accidente>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Accidente a = new Accidente();
				a.setFecha(rs.getString(1));
				a.setHora(rs.getString(2));
				a.setSuceso(rs.getString(3));
				a.setLugar(rs.getString(4));
				a.setRut(rs.getInt(5));
				a.setDias(rs.getInt(6));
				a.setNum_trab(rs.getInt(7));
				listaAccidente.add(a);
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase AccidenteDao, método listar ");
			e.printStackTrace();
		}
		
		
		return listaAccidente;
		
	}

	@Override
	public boolean actualizar(Accidente accidente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(Accidente accidente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Accidente buscar(int rut) {
		// TODO Auto-generated method stub
		return null;
	}

}
