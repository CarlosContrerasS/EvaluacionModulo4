package awl.modulo4.controlador;


import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import awl.modulo4.dao.AtrasosDao;
import awl.modulo4.model.Atrasos;

/**
 * Servlet implementation class ListarAtrasos
 */
@WebServlet("/ListarAtrasos")
public class ListarAtrasos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarAtrasos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				
		AtrasosDao adao = new AtrasosDao();
		
		
		List<Atrasos> listaAtrasos = new ArrayList<Atrasos>();
		listaAtrasos = adao.listar();
		
		
		request.setAttribute("listaAtrasos", listaAtrasos);
		request.getRequestDispatcher("ListarAtrasos.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);	
		
	}
}

