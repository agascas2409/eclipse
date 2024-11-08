package prog.unidad03.repeticion;
import java.util.Scanner;

public class TablasMultiplicarApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("TABLAS DE MULTIPLICAR");
    
    //Imprimimos las tablas de multiplicar
    for(int numero = 1; numero <= 10; numero++) {
      System.out.printf("Tabla del %d%n", numero);
      for (int contador = 1; contador <= 10; contador++){
        int producto = numero * contador;
        System.out.printf("%d X %d = %d%n", numero, contador, producto);
        
      }
    }

  }

}
