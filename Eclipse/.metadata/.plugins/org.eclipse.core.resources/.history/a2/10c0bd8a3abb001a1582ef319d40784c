package awl.modulo4.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import awl.modulo4.dao.ClienteDao;
import awl.modulo4.model.Cliente;

/**
 * Servlet implementation class EditarCliente
 */
@WebServlet("/EditarCliente")
public class EditarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int clienteid = Integer.parseInt(request.getParameter("id"));
		ClienteDao clientedao = new ClienteDao();
		Cliente cli = clientedao.buscar(clienteid);
		request.setAttribute("regcli", cli);
		request.getRequestDispatcher("EditarCliente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		Cliente cli = new Cliente();
		
		int idcliente = Integer.parseInt(request.getParameter("idcliente"));
		String nombre = request.getParameter("nombre");
		int telefono = Integer.parseInt(request.getParameter("telefono"));
		String correo = request.getParameter("correo");
		String rubro = request.getParameter("rubro");
		String direccion = request.getParameter("direccion");
		
		cli.setId(idcliente);
		cli.setNombre(nombre);
		cli.setTelefono(telefono);
		cli.setCorreoelectronico(correo);
		cli.setRubro(rubro);
		cli.setDireccion(direccion);
		
		ClienteDao clientedao = new ClienteDao();
		
		boolean editar = false;
		editar = clientedao.actualizar(cli);
		
		String mensaje = "";
		
		if (editar)
			mensaje = "El cliente ha sido actualizado exitosamente.";
		else
			mensaje = "Ocurrió un error al procesar la solicitud";
		
		request.setAttribute("ccmensaje", mensaje);
		request.setAttribute("regcli", cli);
		request.getRequestDispatcher("EditarCliente.jsp").forward(request, response);		
		
		
	}

}
