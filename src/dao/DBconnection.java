package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBconnection {

	private static final String JDBC_URL = "jdbc:mysql://localhost:8889/LasCosasDeSofia";
	private static Connection instance = null;
	
	//constructor vacio
	private DBconnection() {
		
	}
	
	//creamos la clase Connection, estática para poder llamarla desde cualquier parte, para conectarnos a la base de datos
	

	

	public static Connection getConnection() throws SQLException {
		if (instance == null) {
			Properties props = new Properties();
			props.put("user", "root");
			props.put("password","root");
			instance = DriverManager.getConnection(JDBC_URL,props);
		}
		return instance;
	}

	
	

}
