package modelo;

import java.sql.SQLException;

public class Regalo {
	//atributos de mi clase Regalo
	private int id;
	private String nombre;
	private int precio;
	private String descripcion;
	private String foto;
	
	//contructor vacio
	public Regalo() {
	}

	//contructor con todos los datos incluyendo el id, para cuando saquemos datos de la base de datos
	public Regalo(int id, String nombre, int precio, String descripcion, String foto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.foto = foto;
	}
	
	//constructor sin el id para crear los datos
	public Regalo(String nombre, int precio, String descripcion, String foto) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.foto = foto;
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

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public void insertar() throws SQLException {

		//System.out.println("PRIMER INSERTADO");

		//llamamos al metodo insertar a traves de getInstance y se va a llamar a si mismo (this)
		DAOregalos.getInstance().dao_insertar(this);
		//System.out.print(" INSERTADO ");

	}

	

	
	
	
}
