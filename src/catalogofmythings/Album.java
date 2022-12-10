package catalogofmythings;

/**
 * @author mtovar
 * @author ularg
 */
public class Album {
  String nombre;
  String artista;
  String productor;
  boolean grammy;
  int valoracion;

  public Album(String nombre, String artista) {
    this.nombre = nombre;
    this.artista = artista;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getArtista() {
    return artista;
  }

  public void setArtista(String artista) {
    this.artista = artista;
  }

  public String getProductor() {
    return productor;
  }

  public void setProductor(String productor) {
    this.productor = productor;
  }

  public boolean isGrammy() {
    return grammy;
  }

  public void setGrammy(boolean grammy) {
    this.grammy = grammy;
  }

  public int getValoracion() {
    return valoracion;
  }

  public void setValoracion(int valoracion) {
    this.valoracion = valoracion;
  }
}
