package awl.modulo4.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import awl.modulo4.conexion.ConexionSingleton;
import awl.modulo4.model.Accidentabilidad;

public class AccidentabilidadDao {
	
	public List<Accidentabilidad> listar() {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "SELECT sum(DIAS_PERDIDOS) /sum(NUM_TRAB) from ACCIDENTES"; 
		
		
		List<Accidentabilidad> listaAccidentabilidad = new ArrayList<Accidentabilidad>();


		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Accidentabilidad ac = new Accidentabilidad();
				ac.setAccidentabilidad (rs.getFloat(1));
				listaAccidentabilidad.add(ac);
				
			}
			
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase AccidentabilidadDao, método listar ");
			e.printStackTrace();
		}
		
		return listaAccidentabilidad;
	}

}