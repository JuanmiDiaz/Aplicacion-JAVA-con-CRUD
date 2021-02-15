package controlador;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Usuario;

/**
 * Servlet implementation class Sv_usuarios
 */
@WebServlet("/Sv_usuarios")
public class Sv_usuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sv_usuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre =request.getParameter("nombre");
		String apellidos =request.getParameter("apellidos");
		int edad =Integer.parseInt(request.getParameter("edad"));
		String mail =request.getParameter("mail");
		String pass =request.getParameter("pass");

		
		Usuario u = new Usuario();
		
		u.setNombre(nombre);
		u.setApellidos(apellidos);
		u.setEdad(edad);
		u.setMail(mail);
		u.setPass(pass);

		

		try {
			//System.out.print(" He llegado ");
			u.insertar();
			response.sendRedirect("index.jsp");
			//System.out.print(" He llegado 2");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.print(" NO He llegado ");

		}
		
	}

}
