package catalogofmythings;

/**
 * @author mtovar
 * @author ularg
 */
public class Libro {
  String nombre;
  String autor;
  String publicacion;
  int valoracion;
  String editorial;
  boolean pulitzer;

  public Libro(String nombre, String autor) {
    this.nombre = nombre;
    this.autor = autor;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getPublicacion() {
    return publicacion;
  }

  public void setPublicacion(String publicacion) {
    this.publicacion = publicacion;
  }

  public int getValoracion() {
    return valoracion;
  }

  public void setValoracion(int valoracion) {
    this.valoracion = valoracion;
  }

  public String getEditorial() {
    return editorial;
  }

  public void setEditorial(String editorial) {
    this.editorial = editorial;
  }

  public boolean wonPulitzer() {
    return pulitzer;
  }

  public void setPulitzer(boolean pulitzer) {
    this.pulitzer = pulitzer;
  }
}
