package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import dao.DBconnection;

public class DAOusuarios {
	//atributos de mi clase DAO
	
	private Connection con = null;
	
	public static DAOusuarios instance = null;
	
	
	
	
	//llamamos a la clase DBconnection para conectarnos a la base de datos
	public DAOusuarios() throws SQLException {
		con = DBconnection.getConnection();
	}
	
	//metodo estático que me va a devolver un objeto DAOusuarios
	public static DAOusuarios getInstance() throws SQLException {
		
		//creamos el objeto y nos da acceso a todos los métodos
		if(instance == null) {
			instance = new DAOusuarios();
			
		}

		return instance;
	}
	
	
	
	public void dao_insertar(Usuario u) throws SQLException {
		//System.out.println("ANTES DE LA QUERY");

		PreparedStatement ps = con.prepareStatement("INSERT INTO usuarios (nombre, apellidos, edad, mail, pass) VALUES (?, ?, ?, ?, ?)");
		 
		ps.setString(1, u.getNombre());
		ps.setString(2, u.getApellidos());
		ps.setInt(3, u.getEdad());
		ps.setString(4, u.getMail());
		ps.setString(5, u.getPass());

		
		//System.out.println(ps);
		ps.executeUpdate();
		ps.close();
	}
	
	public void dao_update(Usuario u) {
		
	}

	public void dao_delete(Usuario u) {
	
}

	public void dao_listarUsuarios(Usuario u) {
	
}
	
	
}
