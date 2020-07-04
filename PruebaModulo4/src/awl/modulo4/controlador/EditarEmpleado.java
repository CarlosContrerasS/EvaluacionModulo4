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
 * Servlet implementation class EditarEmpleado
 */
@WebServlet("/EditarEmpleado")
public class EditarEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarEmpleado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int rut_empleado = Integer.parseInt(request.getParameter("rut_empleado"));
		
		EmpleadoDao empleadodao = new EmpleadoDao();
		Empleado emp = empleadodao.buscar(rut_empleado);
		
		int buscar = emp.getRut_empleado();
		System.out.println(buscar);
		String mensaje;
		
		request.setAttribute("regcli", emp);
		
		if (buscar != 0) {
			System.out.println("verdadero");
			request.getRequestDispatcher("EditarEmpleado.jsp").forward(request, response);
		} else {
			 mensaje = "Rut ingresado no es correcto ";
			request.setAttribute("eemensaje", mensaje);
			//response.sendRedirect("Editar.jsp");
			request.getRequestDispatcher("EditarE.jsp").forward(request, response);
		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		Empleado emp = new Empleado();
		
		int rut_empleado = Integer.parseInt(request.getParameter("rut_empleado"));
		String nombre = request.getParameter("nombre");
		String especialidad = request.getParameter("especialidad");
		
		
		emp.setRut_empleado(rut_empleado);
		emp.setNombreempleado(nombre);
		emp.setEspecialidad(especialidad);
		
		
		EmpleadoDao empleadodao = new EmpleadoDao();
		
		boolean editar = false;
	
		editar = empleadodao.actualizar(emp);
		
		String mensaje = "";
		
		if (editar)
			mensaje = "Empleado ha sido actualizado exitosamente.";
		else
			mensaje = "Ocurrió un error al procesar la solicitud";
		
		request.setAttribute("eemensaje", mensaje);
		request.setAttribute("regcli", emp);
		request.getRequestDispatcher("EditarEmpleado.jsp").forward(request, response);		
		
		
		
	}

}
