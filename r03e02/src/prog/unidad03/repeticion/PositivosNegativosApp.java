package prog.unidad03.repeticion;
import java.util.Scanner;

public class PositivosNegativosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("NÚMEROS POSITIVOS Y NEGATIVOS");
    
    int numero;
    //Pedimos el primer numero
    do {
     System.out.print("Introduce un número entero (0 para terminar): ");
     numero = Integer.parseInt(sc.nextLine());
       if(numero > 0) {
         System.out.printf("El número %d es positivo%n", numero);
       } else {
         if(numero < 0) {
           System.out.printf("El número %d es negativo%n", numero);
         }
       }
    } while (numero != 0);

  }

}
