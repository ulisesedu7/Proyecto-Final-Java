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
      System.out.println("3 - Eliminar");
      System.out.println("4 - Salir \n");

      System.out.print("Ingrese la opción: ");
      int option = obiwan.nextInt();

      switch (option) {
        case 1 -> {
          verListas(nombre, mainCatalog);
        }

        case 2 -> {

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
      
      case "albums" -> {
        ArrayList<Album> albums = catalogo.getAlbumes();
        imprimirCosas(albums, seleccion);
      }
      
    }
    
    System.out.println("");
  }
  
  public static void imprimirCosas(ArrayList cosas, String elemento) {
    if(cosas.isEmpty()) {
      System.out.println("Por el momento no tienes " + elemento + " almacenados en tu catalogo!");
      System.out.println("Ingresa alguno para poder visualizarlos aqui");
    } else {
      switch (elemento) {
      case "libros" -> {
        
      }
      
      case "peliculas" -> {
        
      }
      
      case "juegos" -> {
        
      }
      
      case "albums" -> {
        
      }
    }
  }

}
