package labMongoDB;

import java.util.ArrayList;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;

public class Pelicula {
	
	private String nombre;
	private String genero;
	private String director;
	private String franquicia;
	private String pais;
	private int ano;
	private int duracion;
	private String productora;
	private ArrayList<String> actores;
	
	public Pelicula() {
	}
	
	public Pelicula(String nombre, String genero, String director, String franquicia,
			String pais, int ano, int duracion, String productora, ArrayList<String> actores) {
		this.nombre = nombre;
		this.genero = genero;
		this.director = director;
		this.franquicia = franquicia;
		this.pais = pais;
		this.ano = ano;
		this.duracion = duracion;
		this.productora = productora;
		this.actores = actores;
	}
	
	public Pelicula(BasicDBObject dbObjectPelicula) {
		this.nombre = dbObjectPelicula.getString("nombre");
		this.genero = dbObjectPelicula.getString("genero");
		this.director = dbObjectPelicula.getString("director");
		this.franquicia = dbObjectPelicula.getString("franquicia");
		this.pais = dbObjectPelicula.getString("pais");
		this.ano = dbObjectPelicula.getInt("ano");
		this.duracion = dbObjectPelicula.getInt("duracion");
		this.productora = dbObjectPelicula.getString("productora");
		
		BasicDBList listaActores = (BasicDBList) dbObjectPelicula.get("actores");
		this.actores = new ArrayList<String>();
		for (Object actores : listaActores) {
			this.actores.add(actores.toString());
		}
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public String getFranquicia() {
		return franquicia;
	}
	
	public void setFranquicia(String franquicia) {
		this.franquicia = franquicia;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public String getProductora() {
		return productora;
	}
	
	public void setProductora(String productora) {
		this.productora = productora;
	}	

	public ArrayList<String> getActores() {
		return actores;
	}

	public void setActores(ArrayList<String> actores) {
		this.actores = actores;
	}

}
