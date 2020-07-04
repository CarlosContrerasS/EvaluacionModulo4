package awl.modulo4.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import awl.modulo4.dao.VisitaDao;
import awl.modulo4.model.Visita;

/**
 * Servlet implementation class EliminarVisita
 */
@WebServlet("/EliminarVisita")
public class EliminarVisita extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarVisita() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int idvisita = Integer.parseInt(request.getParameter("idvisita"));
		
		Visita vis = new Visita();
		
		vis.setIdvisita(idvisita);
		
		VisitaDao visitadao = new VisitaDao();
		
		boolean eliminar = false;
		eliminar = visitadao.eliminar(vis);

		String mensaje = "";
		
		if (eliminar)
			mensaje = "La visita ha sido eliminada exitosamente.";
		else
			mensaje = "Ocurrió un error al procesar la solicitud";

		List<Visita> listavis = new ArrayList<Visita>();
		listavis = visitadao.listar();				
		request.setAttribute("listavisita", listavis);
		
		request.setAttribute("ccmensaje", mensaje);
		request.getRequestDispatcher("MostrarVisita.jsp").forward(request, response);		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
