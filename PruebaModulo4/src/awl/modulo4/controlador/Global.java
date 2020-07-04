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
import awl.modulo4.dao.AtrasosDao;
import awl.modulo4.dao.ListadoglobalDao;
import awl.modulo4.model.Accidentabilidad;
import awl.modulo4.model.Atrasos;
import awl.modulo4.model.Listado;
/**
 * 
 * Servlet implementation class Global
 */
@WebServlet("/Global")
public class Global extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Global() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		ListadoglobalDao lisdao = new ListadoglobalDao();
		List<Listado> listaglo = new ArrayList<Listado>();
		listaglo  = lisdao.listar();
		

		
		AccidentabilidadDao acdao = new AccidentabilidadDao();
		
		
		List<Accidentabilidad> listaAccidentabilidad = new ArrayList<Accidentabilidad>();
		listaAccidentabilidad = acdao.listar();
		
		AtrasosDao adao = new AtrasosDao();
		
		
		List<Atrasos> listaAtrasos = new ArrayList<Atrasos>();
		listaAtrasos = adao.listar();
		
		
		request.setAttribute("listaAtrasos", listaAtrasos);
		request.setAttribute("listaglobal", listaglo);
		request.setAttribute("listaAccidentabilidad", listaAccidentabilidad);
		request.getRequestDispatcher("Global.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
	}

}
