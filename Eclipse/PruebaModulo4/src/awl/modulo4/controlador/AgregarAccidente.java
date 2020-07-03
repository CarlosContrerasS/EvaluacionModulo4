package awl.modulo4.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.catalina.connector.Request;

import awl.modulo4.dao.AccidenteDao;
import awl.modulo4.model.Accidente;

/**
 * Servlet implementation class AgregarAccidente
 */
@WebServlet("/AgregarAccidente")
public class AgregarAccidente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarAccidente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("CrearAccidente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String fecha = request.getParameter("fecha");
		String hora = request.getParameter("hora");
		String suceso = request.getParameter("suceso");
		String lugar = request.getParameter("lugar");
		int rut = Integer.parseInt(request.getParameter("rut"));
		int dias_perd = Integer.parseInt(request.getParameter("dias_perdidos"));
		int num_trab = Integer.parseInt(request.getParameter("num_trab"));
		
		
		
		
		Accidente acci = new Accidente(fecha, hora, suceso, lugar, rut, dias_perd, num_trab);
		AccidenteDao accidentedao = new AccidenteDao();
		
		boolean agregar = false;
		agregar = accidentedao.agregar(acci);
		
		String mensaje = "";
		
		if (agregar) {
			mensaje = "Accidente ha sido agregado exitosamente.";
		} else {
			mensaje = "Ocurrió un error al procesar la solicitud";
		}
		
		request.setAttribute("camensaje", mensaje);
		request.getRequestDispatcher("CrearAccidente.jsp").forward(request, response);
		
		
		
		
		
		
	}

}
