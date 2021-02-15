package controlador;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Regalo;

/**
 * Servlet implementation class Sv_usuarios
 */
@WebServlet("/Sv_regalos")
public class Sv_regalos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sv_regalos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int id = Integer.parseInt(request.getParameter("id"));
		int opcion = Integer.parseInt(request.getParameter("opcion"));

		System.out.println(id + " con opcion " + opcion);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre =request.getParameter("nombre");
		int precio = Integer.parseInt(request.getParameter("precio"));
		String descripcion =request.getParameter("descripcion");
		String foto =request.getParameter("foto");

		
		Regalo r = new Regalo();
		
		r.setNombre(nombre);
		r.setPrecio(precio);
		r.setDescripcion(descripcion);
		r.setFoto(foto);

		

		try {
			//System.out.print(" He llegado ");
			r.insertar();
			response.sendRedirect("regalos.jsp");
			//System.out.print(" He llegado 2");
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.print(" NO He llegado ");

		}
		
	}

}
