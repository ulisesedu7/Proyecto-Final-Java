package catalogofmythings;

import java.util.ArrayList;

/**
 *
 * @author ularg
 * @author mtovar
 */
public class Catalogo {
  String nombre;
  ArrayList<Libro> libros = new ArrayList();
  ArrayList<Pelicula> peliculas = new ArrayList();
  ArrayList<Juego> juegos = new ArrayList();
  ArrayList<Album> albumes = new ArrayList();

  public Catalogo(String nombre) {
    this.nombre = nombre;
    this.libros = new ArrayList();
    this.peliculas = new ArrayList();
    this.juegos = new ArrayList();
    this.albumes = new ArrayList();
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public ArrayList<Libro> getLibros() {
    return libros;
  }

  public void setLibros(ArrayList<Libro> libros) {
    this.libros = libros;
  }

  public ArrayList<Pelicula> getPeliculas() {
    return peliculas;
  }

  public void setPeliculas(ArrayList<Pelicula> peliculas) {
    this.peliculas = peliculas;
  }

  public ArrayList<Juego> getJuegos() {
    return juegos;
  }

  public void setJuegos(ArrayList<Juego> juegos) {
    this.juegos = juegos;
  }

  public ArrayList<Album> getAlbumes() {
    return albumes;
  }

  public void setAlbumes(ArrayList<Album> albumes) {
    this.albumes = albumes;
  }
  
  // Metodos para crear nuevos elementos
  public void addLibro(String nombreLibro, String autorLibro) {
   this.libros.add(new Libro(nombreLibro, autorLibro)); 
  }

  public void addPelicula(String nombrePeli, String peliYear) {
   this.peliculas.add(new Pelicula(nombrePeli, peliYear)); 
  }
  
  public void addJuego(String nombreJuego) {
   this.juegos.add(new Juego(nombreJuego)); 
  }
  
  public void addAlbum(String nombreAlbum, String artista) {
   this.albumes.add(new Album(nombreAlbum, artista)); 
  }
  
  // Metodos para borrar elementos
  
}
