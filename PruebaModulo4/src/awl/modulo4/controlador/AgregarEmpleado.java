package awl.modulo4.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import awl.modulo4.dao.EmpleadoDao;
import awl.modulo4.model.Empleado;

/**
 * Servlet implementation class AgregarEmpleado
 */
@WebServlet("/AgregarEmpleado")
public class AgregarEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarEmpleado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("CrearEmpleado.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int rut_empleado = Integer.parseInt(request.getParameter("rut_empleado"));
		String nombre = request.getParameter("nombre");
		String especialidad = request.getParameter("especialidad");
		
		Empleado emp = new Empleado(rut_empleado, nombre, especialidad);
		EmpleadoDao empleadodao = new EmpleadoDao();
		
		Empleado empb = empleadodao.buscar(rut_empleado);
		int buscar = empb.getRut_empleado();

		System.out.println(buscar);
		
		
		String mensaje = "";
		
		if (buscar == 0) {

			System.out.println("true");
			System.out.println(emp);
			boolean agregar = false;
			agregar = empleadodao.agregar(emp);

			if (agregar) {
				mensaje = "Empleado ha sido agregado exitosamente.";
			
			} else {
				mensaje = "Ocurrió un error al procesar la solicitud";
			
			}
		} else {
			mensaje = "Rut ingresado ya se encuentra registrado ";
			
		}
		
		request.setAttribute("cemensaje", mensaje);
		request.getRequestDispatcher("CrearEmpleado.jsp").forward(request, response);	
	}

}
