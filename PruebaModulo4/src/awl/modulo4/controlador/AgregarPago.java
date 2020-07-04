package awl.modulo4.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import awl.modulo4.dao.PagoDao;
import awl.modulo4.model.Pago;

/**
 * Servlet implementation class AgregarPago
 */
@WebServlet("/AgregarPago")
public class AgregarPago extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarPago() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("AgregarPago.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		

		String mesanio = request.getParameter("fecha");
		int montoregular = Integer.parseInt(request.getParameter("montoregular"));
		int montoadicional = Integer.parseInt(request.getParameter("montoadicional"));
		int rut = Integer.parseInt(request.getParameter("rut"));
		
		Pago cli = new Pago(rut, mesanio, montoregular, montoadicional);
		PagoDao pagodao = new PagoDao();
		
		boolean agregar = false;
		agregar = pagodao.agregar(cli);
		
		String mensaje = "";
		
		if (agregar)
			mensaje = "El pago ha sido agregado exitosamente.";
		else
			mensaje = "Ocurrió un error al procesar el pago";
		
		request.setAttribute("ccmensaje", mensaje);
		request.getRequestDispatcher("AgregarPago.jsp").forward(request, response);		
		
	}

}