package awl.modulo4.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import awl.modulo4.dao.ClienteDao;
import awl.modulo4.dao.EmpleadoDao;
import awl.modulo4.model.Cliente;
import awl.modulo4.model.Empleado;

/**
 * Servlet implementation class PlanificarVisita
 */
@WebServlet("/PlanificarVisita")
public class PlanificarVisita extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlanificarVisita() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int rutempleado = Integer.parseInt(request.getParameter("rut_empleado"));
		EmpleadoDao empleadodao = new EmpleadoDao();
		Empleado emp = empleadodao.buscar(rutempleado);
		request.setAttribute("regemp", emp);
		request.getRequestDispatcher("PlanificarVisita.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		Empleado emp = new Empleado();	
		Cliente cli = new Cliente();
		
		int rutempleado = Integer.parseInt(request.getParameter("rut_empleado"));
		int rut = Integer.parseInt(request.getParameter("rut"));
		//String direccion = request.getParameter("direccion");
		//String fecha = request.getParameter("fecha");
		//String suceso = request.getParameter("suceso");
		
		
		
		
		emp.setRut_Empleado(rutempleado);
		cli.setRut(rut);
		
		
		
		EmpleadoDao empleadodao = new EmpleadoDao();
		ClienteDao clientedao = new ClienteDao();
		
		
		Empleado buscar_1 = new Empleado();
		Cliente buscar_2 = new Cliente();
		
		buscar_1 = empleadodao.buscar(rutempleado);
		System.out.println(buscar_1);
		buscar_2 = clientedao.buscar(rut);
		System.out.println(buscar_2);
		
		
		
		String mensaje = "";
		
		if (buscar_1.getRut_Empleado()==0 || buscar_2.getRut()==0)
			mensaje = "El Empleado no se encuentra en la base.";
		else
			mensaje = "El Empleado existe en la base";
		
		request.setAttribute("eemensaje", mensaje);
		request.setAttribute("regemp", emp);
		request.getRequestDispatcher("RegistrarVisita.jsp").forward(request, response);
		
		
	}

}
