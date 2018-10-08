package labMongoDB;

import com.mongodb.BasicDBObject;

public class Productora {
	
	private String nombre;
	private int ano;
	private String direccion;
	
	public Productora() {
		
	}
	
	public Productora(String nombre, int ano, String direccion) {
		this.nombre = nombre;
		this.ano = ano;
		this.direccion = direccion;
	}
	
	public Productora(BasicDBObject dbObjectPelicula) {
		this.nombre = dbObjectPelicula.getString("nombre");
		this.ano = dbObjectPelicula.getInt("ano");
		this.direccion = dbObjectPelicula.getString("direccion");
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}	
	
}

	
	
