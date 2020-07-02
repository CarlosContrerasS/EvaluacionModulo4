package awl.modulo4.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import awl.modulo4.dao.EmpleadoDao;
import awl.modulo4.model.Empleado;

@WebServlet("/EliminarEmpleado")

public class EliminarEmpleado extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public EliminarEmpleado() {
		// TODO Auto-generated constructor stub
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int Rut = Integer.parseInt(request.getParameter("rut"));
		
		Empleado emp = new Empleado();
		
		emp.setRut_Empleado(Rut);
		
		EmpleadoDao empleadodao = new EmpleadoDao();
		
		boolean eliminar = false;
		eliminar = empleadodao.eliminar(emp);

		String mensaje = "";
		
		if (eliminar)
			mensaje = "El cliente ha sido eliminado exitosamente.";
		else
			mensaje = "Ocurri� un error al procesar la solicitud";

		List<Empleado> listaemp = new ArrayList<Empleado>();
		listaemp = empleadodao.listar();				
		request.setAttribute("listaempleados", listaemp);
		
		request.setAttribute("ccmensaje", mensaje);
		request.getRequestDispatcher("ListarEmpleados.jsp").forward(request, response);		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}