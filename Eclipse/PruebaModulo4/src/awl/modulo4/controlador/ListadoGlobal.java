package awl.modulo4.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import awl.modulo4.dao.ListadoglobalDao;
import awl.modulo4.model.Listado;


/**
 * Servlet implementation class ListadoGlobal
 */
@WebServlet("/ListadoGlobal")
public class ListadoGlobal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListadoGlobal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.getRequestDispatcher("BuscarListado.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		int rut_cliente = Integer.parseInt(request.getParameter("rut"));
		
		ListadoglobalDao lisdao = new ListadoglobalDao();
		List<Listado> listaglo = new ArrayList<Listado>();
		listaglo  = lisdao.listar(rut_cliente);
		
				
		request.setAttribute("listaglobal", listaglo);
		request.getRequestDispatcher("ListadoGlobal.jsp").forward(request, response);
	}

}
