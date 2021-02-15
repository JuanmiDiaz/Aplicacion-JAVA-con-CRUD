package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.DBconnection;

public class DAOregalos {
	//atributos de mi clase DAO
	
	private Connection con = null;
	
	public static DAOregalos instance = null;
	
	
	
	
	//llamamos a la clase DBconnection para conectarnos a la base de datos
	public DAOregalos() throws SQLException {
		con = DBconnection.getConnection();
	}
	
	//metodo estático que me va a devolver un objeto DAOusuarios
	public static DAOregalos getInstance() throws SQLException {
		
		//creamos el objeto y nos da acceso a todos los métodos
		if(instance == null) {
			instance = new DAOregalos();
			
		}

		return instance;
	}
	
	
	
	public void dao_insertar(Regalo r) throws SQLException {
		//System.out.println("ANTES DE LA QUERY");

		PreparedStatement ps = con.prepareStatement("INSERT INTO regalos (nombre, precio, descripcion, foto) VALUES (?, ?, ?, ?)");
		 
		ps.setString(1, r.getNombre());
		ps.setInt(2, r.getPrecio());
		ps.setString(3, r.getDescripcion());
		ps.setString(4, r.getFoto());

		
		//System.out.println(ps);
		ps.executeUpdate();
		ps.close();
	}
	
	public void dao_update(Regalo r) {
		
	}

	public void dao_delete(Regalo r) {
	
}	

	public ArrayList<Regalo> dao_listarRegalos() throws SQLException {
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM regalos");
		ResultSet rs = ps.executeQuery();
		
		//creamos una colección donde metemos los datos que traemos de la base de datos
		ArrayList<Regalo> result = new ArrayList<Regalo>();
		
		//vamos recorriendo las filas de la base de datos
		while(rs.next()) {
			result.add(new Regalo(rs.getInt("id"),rs.getString("nombre"),rs.getInt("precio"),rs.getString("descripcion"),rs.getString("foto")));
		}
		
	return result;
}
	
	
}
