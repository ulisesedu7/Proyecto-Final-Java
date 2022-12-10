package catalogofmythings;

/**
 *
 * @author ularg
 * @author mtovar
 */
public class Pelicula {
  String nombre;
  String year;
  String director;
  int valoracion;
  boolean oscar;

  public Pelicula(String nombre, String year) {
    this.nombre = nombre;
    this.year = year;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public int getValoracion() {
    return valoracion;
  }

  public void setValoracion(int valoracion) {
    this.valoracion = valoracion;
  }

  public boolean wonOscar() {
    return oscar;
  }

  public void setOscar(boolean oscar) {
    this.oscar = oscar;
  }  
}
