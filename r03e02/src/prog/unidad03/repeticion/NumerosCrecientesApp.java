package prog.unidad03.repeticion;
import java.util.Scanner;

public class NumerosCrecientesApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("NÚMEROS CRECIENTES");
    
    //Pedimos el primer numero
    System.out.print("Introduce un número entero: ");
    int numero = Integer.parseInt(sc.nextLine());
    
    int mayor = numero;
    
    do {
      mayor = numero;
      System.out.printf("Introduce ahora un número mayor que %d (Introduce un número menor o igual para terminar): ", mayor);
      numero = Integer.parseInt(sc.nextLine());
    } while (numero > mayor);
      System.out.printf("El número %d no es mayor que el numero anterior %d. Terminado", numero, mayor);

  }

}
