package awl.modulo4.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import awl.modulo4.dao.ClienteDao;
import awl.modulo4.dao.EmpleadoDao;
import awl.modulo4.dao.VisitaDao;
import awl.modulo4.model.Cliente;
import awl.modulo4.model.Empleado;
import awl.modulo4.model.Visita;

/**
 * Servlet implementation class AgregarVisita
 */
@WebServlet("/AgregarVisita")
public class AgregarVisita extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarVisita() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("AgregarVisita.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		

		int rut = Integer.parseInt(request.getParameter("rut"));
		int rut_empleado = Integer.parseInt(request.getParameter("rut_empleado"));
		
		String direccion = request.getParameter("direccion");
		String ciudad = request.getParameter("ciudad");
		String fecha = request.getParameter("fecha");
		String resumen = request.getParameter("resumen");
		String observaciones = request.getParameter("observaciones");
		
		Visita vis = new Visita (direccion, ciudad, fecha, resumen, observaciones, rut, rut_empleado);
		VisitaDao visitadao = new VisitaDao();
		
		
		ClienteDao clientedao = new ClienteDao();
		Cliente clib = clientedao.buscar(rut);
		
		EmpleadoDao empleadodao = new EmpleadoDao();
		Empleado empb = empleadodao.buscar(rut_empleado);
		
		int buscar_rut = clib.getRut();
		int buscar_rut_empleado = empb.getRut_empleado();
		
		boolean agregar = false;
		
		
		String mensaje = "";
		
		if(buscar_rut == 0 || buscar_rut_empleado == 0) {
			
			mensaje = "El Rut del Cliente o el rut del Empleado no coiciden. Ingrese nuevamente";
			request.setAttribute("ccmensaje", mensaje);
			request.getRequestDispatcher("AgregarVisita.jsp").forward(request, response);
			
		}
		else {
			agregar = visitadao.agregar(vis);
			
			if (agregar) {
				mensaje = "La Visita ha sido agregada exitosamente.";
			}
			else {
				mensaje = "Ocurrió un error al procesar la solicitud";
			}
		}
			
		request.setAttribute("ccmensaje", mensaje);
		request.getRequestDispatcher("AgregarVisita.jsp").forward(request, response);		
		
	}

}
