package catalogofmythings;

/**
 * @author mtovar
 * @author ularg
 */
public class Juego {
  String nombre;
  String year;
  String desarrollador;
  int valoracion;
  boolean goy;

  public Juego(String nombre) {
    this.nombre = nombre;
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

  public String getDesarrollador() {
    return desarrollador;
  }

  public void setDesarrollador(String desarrollador) {
    this.desarrollador = desarrollador;
  }

  public int getValoracion() {
    return valoracion;
  }

  public void setValoracion(int valoracion) {
    this.valoracion = valoracion;
  }

  public boolean wonGoy() {
    return goy;
  }

  public void setGoy(boolean goy) {
    this.goy = goy;
  }
}
