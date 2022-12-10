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

    do {
      System.out.println("Elija que opcion deseas: ");
      System.out.println("1 - Ver listas");
      System.out.println("2 - Almacenar");
      System.out.println("3 - Salir \n");

      System.out.print("Ingrese la opción: ");
      int option = obiwan.nextInt();

      switch (option) {
        case 1 -> {
          
        }

        case 2 -> {
          
        }

        case 3 ->
          System.out.println("Gracias por usar usar el programa, ¡feliz día!");

        default ->
          System.out.println("Elija una opcion de las anteriores");
      }

      // Salir del programa 
      if (option == 3) {
        break;
      }
    } while (true);
  }
}
