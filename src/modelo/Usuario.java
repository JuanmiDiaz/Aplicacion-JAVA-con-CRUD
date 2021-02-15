package modelo;

import java.sql.SQLException;

public class Usuario {
	//atributos de mi clase Usuario
	private int id;
	private String nombre;
	private String apellidos;
	private int edad;
	private String mail;
	private String pass;
	
	//contructor vacio
	public Usuario() {
	}

	//contructor con todos los datos incluyendo el id, para cuando saquemos datos de la base de datos
	public Usuario(int id, String nombre, String apellidos, int edad, String mail, String pass) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.mail = mail;
		this.pass = pass;
	}
	
	//constructor sin el id para crear los datos
	public Usuario(String nombre, String apellidos, int edad, String mail, String pass) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.mail = mail;
		this.pass = pass;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	
	
	public void insertar() throws SQLException {

		//System.out.println("PRIMER INSERTADO");

		//llamamos al metodo insertar a traves de getInstance y se va a llamar a si mismo (this)
		DAOusuarios.getInstance().dao_insertar(this);
		//System.out.print(" INSERTADO ");

	}
	
	
}
