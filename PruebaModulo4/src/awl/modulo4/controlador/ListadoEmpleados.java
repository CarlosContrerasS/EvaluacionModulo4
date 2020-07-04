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

@WebServlet("/ListadoEmpleados")

public class ListadoEmpleados extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListadoEmpleados() {
		 super();
		// TODO Auto-generated constructor stub
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		EmpleadoDao emdao = new EmpleadoDao();
		List<Empleado> listaemp = new ArrayList<Empleado>();
		listaemp = emdao.listar();
				
		request.setAttribute("listaempleados", listaemp);
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



