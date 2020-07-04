package awl.modulo4.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import awl.modulo4.dao.AccidentabilidadDao;
import awl.modulo4.model.Accidentabilidad;


/**
 * Servlet implementation class Accidentabilidad
 */
@WebServlet("/Accidentabilidad")
public class AgregarAccidentabilidad extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarAccidentabilidad() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//Accidentabilidad ac = new Accidentabilidad ();
		AccidentabilidadDao acdao = new AccidentabilidadDao();
		
		
		List<Accidentabilidad> listaAccidentabilidad = new ArrayList<Accidentabilidad>();
		listaAccidentabilidad = acdao.listar();
		
		//String mensaje = "";
		
		
		System.out.println("variable"+listaAccidentabilidad);
		
		request.setAttribute("listaAccidentabilidad", listaAccidentabilidad);
		request.getRequestDispatcher("Accidentabilidad.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

	public void setAccidentabilidad(float float1) {
		// TODO Auto-generated method stub
		
	}
		
	

}
