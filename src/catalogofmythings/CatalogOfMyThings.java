package catalogofmythings;

import java.util.*;

/**
 *
 * @author ularg
 * @author mtovar
 */
public class CatalogOfMyThings {

  public static void main(String[] args) {
    // Call mainMenu fucntion
    mainMenu();
  }

  public static void mainMenu() {
    // Initialize scanner
    Scanner obiwan = new Scanner(System.in);

    System.out.println("-- Bienvenido al Catalogo de tus cosas! --");
    System.out.println("Aqui podrás guardar tus cosas favoritas e información respectiva a ellas");

    System.out.println("¿Cómo te llamas?");
    String nombre = obiwan.nextLine();

    System.out.println("Mucho gusto" + nombre);
    System.out.println("¿Cómo llamaras tu catalogo?");
    String nombreCatalogo = obiwan.nextLine();

    // Crear un nuevo catalogo que almacenara toda la informacion
    Catalogo mainCatalog = new Catalogo(nombreCatalogo);

    do {
      System.out.println("Elija que opcion deseas: ");
      System.out.println("1 - Ver listas");
      System.out.println("2 - Almacenar");
      System.out.println("3 - Editar");
      System.out.println("4 - Salir \n");

      System.out.print("Ingrese la opción: ");
      int option = obiwan.nextInt();

      switch (option) {
        case 1 -> {
          verListas(nombre, mainCatalog);
        }

        case 2 -> {
          mainCatalog = agregarCosas(mainCatalog, nombre);
        }

        case 3 ->
          System.out.println("Gracias por usar usar el programa, ¡feliz día!");

        default ->
          System.out.println("Elija una opcion de las anteriores");
      }

      // Salir del programa 
      if (option == 4) {
        break;
      }
    } while (true);
  }

  /*
    Metodos para ver listas de los elementos agregados
   */
  public static void verListas(String nombre, Catalogo catalogo) {
    // Initialize scanner
    Scanner obiwan = new Scanner(System.in);
    System.out.println("Hola " + nombre);
    System.out.println("En esta sección podrás visualizar todas las cosas en tu catalogo");

    do {
      System.out.println("¿Qué te gustaría ver de lo que tienes guardado?");

      System.out.println("Elija que opcion deseas: ");
      System.out.println("1 - Mis libros favoritos");
      System.out.println("2 - Las mejores películas");
      System.out.println("3 - Juegos geniales");
      System.out.println("4 - Albumes de recuerdos");
      System.out.println("5 - Regresar al menu principal \n");

      System.out.print("Ingrese la opción: ");
      int option = obiwan.nextInt();

      switch (option) {
        case 1 -> {
          misCosas(catalogo, "libros");
        }

        case 2 -> {
          misCosas(catalogo, "peliculas");
        }

        case 3 ->
          misCosas(catalogo, "juegos");

        case 4 ->
          misCosas(catalogo, "albumes");

        default ->
          System.out.println("Elija una opcion de las anteriores");
      }

      // Salir del programa 
      if (option == 5) {
        break;
      }
    } while (true);
  }

  // Meotodo para mostrar los libros favoritos
  public static void misCosas(Catalogo catalogo, String seleccion) {

    switch (seleccion) {
      case "libros" -> {
        ArrayList<Libro> libros = catalogo.getLibros();
        imprimirCosas(libros, seleccion);
      }

      case "peliculas" -> {
        ArrayList<Pelicula> peliculas = catalogo.getPeliculas();
        imprimirCosas(peliculas, seleccion);
      }

      case "juegos" -> {
        ArrayList<Juego> juegos = catalogo.getJuegos();
        imprimirCosas(juegos, seleccion);
      }

      case "albumes" -> {
        ArrayList<Album> albums = catalogo.getAlbumes();
        imprimirCosas(albums, seleccion);
      }

    }

    System.out.println("");
  }

  public static void imprimirCosas(ArrayList cosas, String elemento) {
    if (cosas.isEmpty()) {
      System.out.println("Por el momento no tienes " + elemento + " almacenados en tu catalogo!");
      System.out.println("Ingresa alguno para poder visualizarlos aqui");
    } else {
      switch (elemento) {
        case "libros" -> {
          System.out.println("---LISTA DE SUS LIBROS---");
          for (int i = 0; i < cosas.size(); i++) {
            Libro libroSeleccionado = (Libro) cosas.get(i);
            int libroNum = i + 1;

            System.out.println("-------LIBRO #" + libroNum + "-------");
            System.out.println(libroSeleccionado.getNombre() + " escrito por: " + libroSeleccionado.getAutor());
            System.out.println("Publicado por la editorial: " + libroSeleccionado.getEditorial() + " en la fecha: " + libroSeleccionado.getPublicacion());
            System.out.println("Has valorado este libro con una calificación de: " + libroSeleccionado.getValoracion() + "/5");

            if (libroSeleccionado.wonPulitzer()) {
              System.out.println("Esa es un libro super genial, porque tiene un pulitzer!!!");
            }
            System.out.println("------------------------");
          }

        }

        case "peliculas" -> {
          System.out.println("---LISTA DE SUS PELICULAS---");
          for (int i = 0; i < cosas.size(); i++) {
            Pelicula peliculaSeleccionada = (Pelicula) cosas.get(i);
            int peliNum = i + 1;

            System.out.println("-------PELICULA #" + peliNum + "-------");
            System.out.println(peliculaSeleccionada.getNombre() + " publicada en el año: " + peliculaSeleccionada.getYear());
            System.out.println("Publicado dirigida por: " + peliculaSeleccionada.getDirector());
            System.out.println("Has valorado esta pelicula con una calificación de: " + peliculaSeleccionada.getValoracion() + "/5");

            if (peliculaSeleccionada.wonOscar()) {
              System.out.println("Esa es una increible pelicula, porque tiene un oscar!!!");
            }
            System.out.println("------------------------");
          }

        }

        case "juegos" -> {
          System.out.println("---LISTA DE SUS JUEGOS---");
          for (int i = 0; i < cosas.size(); i++) {
            Juego juegoSeleccionado = (Juego) cosas.get(i);
            int peliNum = i + 1;

            System.out.println("-------JUEGO #" + peliNum + "-------");
            System.out.println(juegoSeleccionado.getNombre());
            System.out.println("Desarrollado por: " + juegoSeleccionado.getDesarrollador());
            System.out.println("Publicada en el año: " + juegoSeleccionado.getYear());
            System.out.println("Has valorado este juego con una calificación de: " + juegoSeleccionado.getValoracion() + "/5");

            if (juegoSeleccionado.wonGoy()) {
              System.out.println("Esa es un juego asombroso, porque tiene un GOY award!!!");
            }
            System.out.println("------------------------");
          }
        }

        case "albumes" -> {
          System.out.println("---LISTA DE SUS Albumes---");
          for (int i = 0; i < cosas.size(); i++) {
            Album albumSeleccionado = (Album) cosas.get(i);
            int peliNum = i + 1;

            System.out.println("-------ALBUM #" + peliNum + "-------");
            System.out.println(albumSeleccionado.getNombre() + " elaborado por: " + albumSeleccionado.getArtista());
            System.out.println("Producido por: " + albumSeleccionado.getProductor());
            System.out.println("Has valorado este album con una calificación de: " + albumSeleccionado.getValoracion() + "/5");

            if (albumSeleccionado.isGrammy()) {
              System.out.println("Esa es un album bellisimo, porque tiene un grammy award!!!");
            }
            System.out.println("------------------------");
          }
        }
      }
    }
  }

  /*
    Metodos para agregar cosas al catalogo
   */
  public static Catalogo agregarCosas(Catalogo catalogo, String nombre) {
    // Initialize scanner
    Scanner obiwan = new Scanner(System.in);
    System.out.println("Hola " + nombre);
    System.out.println("En esta sección podrás agregar tus cosas favoritas en tu catalogo");

    do {
      System.out.println("¿Qué te gustaría agregar en tu catalogo?");

      System.out.println("Elija que opcion deseas: ");
      System.out.println("1 - Mis libros favoritos");
      System.out.println("2 - Las mejores películas");
      System.out.println("3 - Juegos geniales");
      System.out.println("4 - Albumes de recuerdos");
      System.out.println("5 - Regresar al menu principal \n");

      System.out.print("Ingrese la opción: ");
      int option = obiwan.nextInt();

      switch (option) {
        case 1 -> {
          catalogo = addLibro(catalogo);
        }

        case 2 -> {
          catalogo = addPelicula(catalogo);
        }

        case 3 ->
          catalogo = addJuego(catalogo);

        case 4 ->
          catalogo = addAlbum(catalogo);

        default ->
          System.out.println("Elija una opcion de las anteriores");
      }

      // Salir del programa 
      if (option == 5) {
        break;
      }
    } while (true);

    return catalogo;
  }

  public static Catalogo addLibro(Catalogo catalogo) {
    // Initialize scanner
    Scanner obiwan = new Scanner(System.in);

    System.out.println("Para agregar el libro debes de ingresar sus datos: ");

    System.out.print("Ingresa el nombre del libro: ");
    String libroName = obiwan.nextLine();

    System.out.print("Ingresa el autor del libro: ");
    String libroAuthor = obiwan.nextLine();

    catalogo.addLibro(libroName, libroAuthor);

    System.out.println("--LIBRO AGREGADO EXITOSAMENTE-- \n");

    return catalogo;
  }

  public static Catalogo addPelicula(Catalogo catalogo) {
    // Initialize scanner
    Scanner obiwan = new Scanner(System.in);

    System.out.println("Para agregar una pelicula debes de ingresar sus datos: ");

    System.out.print("Ingresa el nombre de la película: ");
    String peliName = obiwan.nextLine();

    System.out.print("Ingresa el año que salió la película: ");
    String peliYear = obiwan.nextLine();

    catalogo.addPelicula(peliName, peliYear);

    System.out.println("--PELICULA AGREGADO EXITOSAMENTE-- \n");

    return catalogo;
  }

  public static Catalogo addJuego(Catalogo catalogo) {
    // Initialize scanner
    Scanner obiwan = new Scanner(System.in);

    System.out.println("Para agregar un juego debes de ingresar sus datos: ");

    System.out.print("Ingresa el nombre del juego: ");
    String juegoName = obiwan.nextLine();

    catalogo.addJuego(juegoName);

    System.out.println("--JUEGO AGREGADO EXITOSAMENTE-- \n");

    return catalogo;
  }

  public static Catalogo addAlbum(Catalogo catalogo) {
    // Initialize scanner
    Scanner obiwan = new Scanner(System.in);

    System.out.println("Para agregar un album debes de ingresar sus datos: ");

    System.out.print("Ingresa el nombre del album: ");
    String albumName = obiwan.nextLine();

    System.out.print("Ingresa el artista o banda del album: ");
    String albumArtista = obiwan.nextLine();

    catalogo.addAlbum(albumName, albumArtista);

    System.out.println("--ALBUM AGREGADO EXITOSAMENTE-- \n");

    return catalogo;
  }
  /*
    Metodos para ediras cosas al catalogo
   */

}
