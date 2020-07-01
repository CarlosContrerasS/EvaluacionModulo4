package awl.modulo4.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import awl.modulo4.dao.ClienteDao;
import awl.modulo4.model.Cliente;

/**
 * Servlet implementation class EliminarCliente
 */
@WebServlet("/EliminarCliente")
public class EliminarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarCliente() {
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
		
		Cliente cli = new Cliente();
		cli.setId(clienteid);
		
		ClienteDao clientedao = new ClienteDao();
		
		boolean eliminar = false;
		eliminar = clientedao.eliminar(cli);

		String mensaje = "";
		
		if (eliminar)
			mensaje = "El cliente ha sido eliminado exitosamente.";
		else
			mensaje = "Ocurrió un error al procesar la solicitud";

		List<Cliente> listacli = new ArrayList<Cliente>();
		listacli = clientedao.listar();				
		request.setAttribute("listaclientes", listacli);
		
		request.setAttribute("ccmensaje", mensaje);
		request.getRequestDispatcher("ListarClientes.jsp").forward(request, response);		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
